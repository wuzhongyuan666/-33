package c.cn.dao;

import c.cn.bean.Teachar;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1715:08
 * Description:
 * Version: V1.0
 */
public interface TeacharMapper {
    List<Teachar>  selectAll();
    Teachar selectById(Integer id);
}
