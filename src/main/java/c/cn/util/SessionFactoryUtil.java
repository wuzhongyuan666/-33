package c.cn.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: hly
 * Date: 2019/05/1514:24
 * Description:
 * Version: V1.0
 */
public class SessionFactoryUtil {
    //统一一个线程 访问的同一个SqlSession
    static  private  ThreadLocal<SqlSession>    local=new ThreadLocal<>();

    private SessionFactoryUtil(){}


    public  static  SqlSession  getSqlSession(){
        if(local.get()==null){
            try {
                SqlSessionFactory sqlSessionFactory=   new SqlSessionFactoryBuilder().build( Resources.getResourceAsStream("mybatis-config.xml"));
                SqlSession  sqlSession=sqlSessionFactory.openSession();
                local.set(sqlSession);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return  local.get();
    }

    public  static  void  closeSqlSession(){
        if(local.get()!=null){
             local.get().close();
             local.remove();
        }
    }


}
