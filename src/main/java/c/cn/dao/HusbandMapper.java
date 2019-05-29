package c.cn.dao;

import c.cn.bean.Husband;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1710:36
 * Description:
 * Version: V1.0
 */
public interface HusbandMapper {
    List<Husband> selectAll();
   Husband selectById();

}
