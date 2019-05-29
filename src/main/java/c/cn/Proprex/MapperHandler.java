package c.cn.Proprex;



import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:  MapperHandler
 * Author:   命运造我
 * Date:     2019/5/15 22:46
 * Description:
 */
public class MapperHandler {
    //所有的xml路径
    private static List<String> paths;
    //                        namespace       id 和对象
    private static Map<String, Map<String, SqlMapper>> mappers;
    //所有的代理对象  key:接口的全限定命名 值:代理对象
    private static Map<String, Object> proxys;

    public static void init(String path) {
        //路径  比如mapper/userMapper.xml
        paths = ClassScanner.scannerClass(path);
        mappers = new HashMap<>(paths.size());
        proxys = new HashMap<>(paths.size());
        for (String xmlPath : paths) {
            try {
                //根据xml路径获得namespace
                String nameSpace = AcquisitionXml.getNameSpace(xmlPath);
                //获得了方法名和实体
                Map<String, SqlMapper> mapper = AcquisitionXml.getMethodsName(xmlPath);
                mappers.put(nameSpace, mapper);
                MapperProxy mapperProxy = new MapperProxy();
                //代理对象
                Object proxy = mapperProxy.newMapperProxy(Class.forName(nameSpace));
                proxys.put(nameSpace, proxy);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static SqlMapper getMapper(String namespace, String methodName) {
        return mappers.get(namespace).get(methodName);
    }

    public static <T> T getProxy(Class<T> type) {
        return (T) proxys.get(type.getName());
    }

    public static <T> T getProxy(String className) {
        return getProxy(className);
    }

}
