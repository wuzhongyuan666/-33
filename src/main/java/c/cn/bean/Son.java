package c.cn.bean;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1711:13
 * Description:
 * Version: V1.0
 */
public class Son {
    private  Integer id;
    private  String name;
    private Fathor  fathor;

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

    public Fathor getFathor() {
        return fathor;
    }

    public void setFathor(Fathor fathor) {
        this.fathor = fathor;
    }
}

