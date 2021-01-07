/**
 * @AUTHOR : 张辉阳
 * @date :  2020/11/15 21:38
 * @version : 1.0
 */


package Member;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String name;
    private int age;
    private Date birthday;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public User() {
    }

    public User(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirStr(){
        if (birthday != null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return simpleDateFormat.format(birthday);
        } else {
            return "";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
