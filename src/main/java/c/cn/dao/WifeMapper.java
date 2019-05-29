package c.cn.dao;

import c.cn.bean.Wife;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1710:20
 * Description:
 * Version: V1.0
 */
public interface WifeMapper {
    List<Wife> selectAll();
     Wife selectById(Integer id);
}
