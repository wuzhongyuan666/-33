import c.cn.bean.User;
import c.cn.dao.CourseMapper;
import c.cn.dao.PlateMapper;
import c.cn.dao.UserDao;
import c.cn.dao.UserMapper;
import c.cn.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1516:18
 * Description:
 * Version: V1.0
 */
public class testUser {


    @Test
    public  void test(){
        UserDao userDao=new UserDao();
        System.out.println(Arrays.toString(userDao.seletAll().toArray()));
    }
@Test
    public  void test1(){
        UserDao userDao=new UserDao();
        User user=new User();
        user.setName("飞云2");
        user.setNick("飞飞飞云2");
        user.setPassword("6666662");
        user.setPhone("10505992922");
        user.setSex("女");

        System.out.println(userDao.addUser(user));
    }
    @Test
    public  void test2(){
        SqlSession session= SessionFactoryUtil.getSqlSession();
        //创建接口的代理对象
        PlateMapper mapper=session.getMapper(PlateMapper.class);
        System.out.println(mapper.seleteall().size());
    }

        @Test
    public void test3(){
        SqlSession session=SessionFactoryUtil.getSqlSession();
        UserMapper mapper=  session.getMapper(UserMapper.class);

        System.out.println(Arrays.toString(mapper.selectAll().toArray()));
    }
@Test
    public  void selectAllBywhere(){
        SqlSession session=SessionFactoryUtil.getSqlSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        Map map= new HashMap<String,Object>();
//        map.put("sex","男");
//        map.put("name","梦的祈愿");
        map.put("start",4);
        map.put("end",8);
        System.out.println(mapper.selectAllBywhere(map).toArray());
    }


    @Test
    public  void selectAllBywhere2(){
        SqlSession session=SessionFactoryUtil.getSqlSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(8);
//        map.put("sex","男");
//        map.put("name","梦的祈愿");
//        map.put("start",4);
//        map.put("end",8);
        System.out.println(mapper.selectByArrayId(list).size());
    }

@Test   //逆向测试
    public  void  testnixiang(){
    SqlSession session=SessionFactoryUtil.getSqlSession();
    CourseMapper  mapper=session.getMapper(CourseMapper.class);
    System.out.println(mapper.selectByPrimaryKey(1).getCname());
}
}
