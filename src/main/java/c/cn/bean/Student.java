package c.cn.bean;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1715:06
 * Description:
 * Version: V1.0
 */
public class Student {
    private  Integer  id;
    private  String  name;
    private Set<Teachar> teachars;

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

    public Set<Teachar> getTeachars() {
        return teachars;
    }

    public void setTeachars(Set<Teachar> teachars) {
        this.teachars = teachars;
    }
}
