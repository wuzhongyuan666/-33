package c.cn.bean;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1711:12
 * Description:
 * Version: V1.0
 */
public class Fathor {
    private  Integer id;
    private  String name;
    private Set<Son>  sons;

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

    public Set<Son> getSons() {
        return sons;
    }

    public void setSons(Set<Son> sons) {
        this.sons = sons;
    }
}
