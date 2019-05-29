package c.cn.bean;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1516:03
 * Description:
 * Version: V1.0
 */
public class User {
    private  Integer id;
    private String   name;
    private  String password;
    private  String sex;
    private  String nick;
    private  String  phone;
    private Date  birth;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", nick='" + nick + '\'' +
                ", phone='" + phone + '\'' +
                ", birth=" + birth +
                '}';
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }



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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
