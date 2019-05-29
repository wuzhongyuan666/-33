package c.cn.bean;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1710:18
 * Description:
 * Version: V1.0
 */
public class Husband {
    private  Integer id;
    private  String name;
    private  String phone;
    private  Wife  wife;

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

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
