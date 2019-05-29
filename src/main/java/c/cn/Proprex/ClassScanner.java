package c.cn.Proprex;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * ClassName:  ClassScanner
 * Author:   命运造我
 * Date:     2019/5/15 22:35
 * Description:
 */
public class ClassScanner {

    public static List<String> scannerClass(String path) {
        System.out.println("1232132");
        List<String> result = new ArrayList<>(16);
        URL resource = ClassScanner.class.getResource("/" + path);
        //获取路径
        File[] files = new File(resource.getPath()).listFiles();
        for (File file : files) {
            //截取为我们想要的路径  比如mapper/userMapper.xml
            result.add(file.getPath().substring(file.getPath().indexOf("mapper")));
        }
        return result;
    }


}

