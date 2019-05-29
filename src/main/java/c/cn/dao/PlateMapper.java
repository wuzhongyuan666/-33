package c.cn.dao;

import c.cn.bean.Plate;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1520:53
 * Description:
 * Version: V1.0
 */
public interface PlateMapper {

    List<Plate> seleteall();

    int insert(Plate plate);
}
