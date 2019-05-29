package c.cn.bean;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1715:05
 * Description:
 * Version: V1.0
 */
public class Teachar {
    private Integer id;
    private  String name;
    private Set<Student> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
