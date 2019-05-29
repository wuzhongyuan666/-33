package c.cn.Proprex;

import org.apache.ibatis.io.Resources;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:  AcquisitionXml
 * Author:   命运造我
 * Date:     2019/5/15 18:24
 * Description:
 */
public class AcquisitionXml {
    static final SAXReader READER = new SAXReader();

    private AcquisitionXml() {

    }

    static private Document getDocument(String xml) throws Exception {
        return READER.read(Resources.getResourceAsStream(xml));
    }

    static private List<Element> sqlList(String xml) throws Exception {
        Document document = getDocument(xml);
        List<Element> lists = new ArrayList<>();
        Element root = document.getRootElement();
        lists.addAll(root.selectNodes("//select"));
        lists.addAll(root.selectNodes("//insert"));
        lists.addAll(root.selectNodes("//update"));
        lists.addAll(root.selectNodes("//delete"));
        //返回了所有的mapper的子标签  select insert update delete标签
        return lists;
    }

    public static String getNameSpace(String xml) throws Exception {
        //获得文档流
        Document document = getDocument(xml);
        //获取根目录
        Element root = document.getRootElement();
        //返回了mapper的namespace
        return root.attributeValue("namespace");
    }

    static public Map<String, SqlMapper> getMethodsName(String xml) throws Exception {
        List<Element> elements = sqlList(xml);
        Map<String, SqlMapper> mappers = new HashMap<>(elements.size());
        for (Element element : elements) {
            SqlMapper mapper = new SqlMapper();
            mapper.setSql(element.getText());
            mapper.setParameterMap(element.attributeValue("parameterMap"));
            mapper.setParameterType(element.attributeValue("parameterType"));
            mapper.setResultMap(element.attributeValue("resultMap"));
            mapper.setResultType(element.attributeValue("resultType"));
            mappers.put(element.attributeValue("id"), mapper);
        }
        //返回调用的方法名
        return mappers;
    }
}
