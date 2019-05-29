package c.cn.dao;

import c.cn.bean.Son;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1711:46
 * Description:
 * Version: V1.0
 */
public interface SonMapper {
    List<Son>  selectAll();
    Son selectById();
}
