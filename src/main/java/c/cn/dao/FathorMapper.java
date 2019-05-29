package c.cn.dao;

import c.cn.bean.Fathor;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1711:19
 * Description:
 * Version: V1.0
 */
public interface FathorMapper {
    List<Fathor> selectAll();
        Fathor selectById();
}
