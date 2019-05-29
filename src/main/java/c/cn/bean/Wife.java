package c.cn.bean;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1710:16
 * Description:
 * Version: V1.0
 */
public class Wife {
    private Integer id;
    private String name;
    private  String phone;
    private  Husband husband;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
