package c.cn.dao;

import c.cn.bean.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1715:10
 * Description:
 * Version: V1.0
 */
public interface StudentMapper {
    List<Student>  selectAll();
    Student  selectById(Integer id);
}
