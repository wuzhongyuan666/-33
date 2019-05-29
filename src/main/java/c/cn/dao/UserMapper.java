package c.cn.dao;

import c.cn.bean.User;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1612:17
 * Description:
 * Version: V1.0
 */
public interface UserMapper {
    List<User> selectAll();
    int insertUser();
    List<User> selectAllBywhere(Map map);
    List<User>  selectByArrayId(List<Integer> list);
}
