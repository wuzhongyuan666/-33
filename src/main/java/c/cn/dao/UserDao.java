package c.cn.dao;

import c.cn.bean.User;
import c.cn.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1516:13
 * Description:
 * Version: V1.0
 */
public class UserDao {

    public List<User> seletAll(){
       SqlSession session=  SessionFactoryUtil.getSqlSession();
      return session.selectList("user.selectAll");
    }

    public   int  addUser(User user){
        SqlSession session=SessionFactoryUtil.getSqlSession();
       int i= session.insert("user.inser",user);

        return i;
    }
}
