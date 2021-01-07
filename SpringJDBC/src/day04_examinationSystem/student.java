package day04_examinationSystem;

import utils.utils;

import java.util.Scanner;

public class student extends user{
    private String name;
    private String password;
    private String sex;
    private Integer age;
    private String address;
    private String phone;
    private final static int role = 1;
    static {

    }

    public student(String name, String password, String sex, Integer age, String address, String phone) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public student() {
    }

    public int getRole() {
        return role;
    }
    public void register(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入密码:");
        String password = sc.next();
        System.out.println("请输入性别:");
        String sex = sc.next();
        System.out.println("请输入年龄:");
        Integer age = sc.nextInt();
        System.out.println("请输入地址:");
        String address = sc.next();
        System.out.println("请输入手机号码:");
        String phone  = sc.next();
        String sql = "insert into user(name,password,sex,age,address,phone) values(?,?,?,?,?,?)";
        super.template.update(sql,name,password,sex,age,address,phone);
        question.setQuestion(utils.findid(name));
        System.out.println("注册成功!");
    }

    public static void main(String[] args) {
        student stu = new student();
        stu.register();
    }
}
