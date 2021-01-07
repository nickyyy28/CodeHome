package day04_examinationSystem;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;
import utils.utils;

import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    protected static JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    public static void main(String[] args) {
        int num;
        System.out.println("输入1学生登陆,输入2考官登录,输入3获取帮助,输入4退出考试系统,输入5注册账号,忘记密码输入6");
        while (true){
            System.out.print("输入数字:");
            num=sc.nextInt();
            if (num==1){
                Stu_logIn();
            }
            if (num==2){

            }
            if (num==3){
                System.out.println("输入1学生登陆,输入2考官登录,输入3获取帮助,输入4退出考试系统,输入5注册账号,忘记密码输入6");
            }
            if (num==4){
                System.out.println("感谢您的使用!");
                break;
            }
            if (num==5){
                createstudent();
            }
            if (num==6){
                findpassword();
            }
        }
    }

    //学生注册
    public static void createstudent(){
        new student().register();
    }

    //学生登陆
    public static void Stu_logIn(){
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();
        if (utils.user_is_exists(name,password)){
            System.out.println("登陆成功!");
            System.out.println("输入1考试,输入2退出登录,输入3退出系统");
            int num = 0;
            while (true){
                num = sc.nextInt();
                if (num == 1){

                }
                if (num == 2){
                    break;
                }
                if (num == 3){
                    System.out.println("感谢您的使用!");
                    System.exit(0);
                }
            }

        } else {
            System.out.println("登陆失败!");
        }
    }

    //找回密码
    public static void findpassword(){
        System.out.println("请输入姓名");
        String name = sc.next();
        if (utils.isexits(name)){
            question ques = utils.return_question(utils.findid(name));
            System.out.println("第1个问题:"+ques.getQuestion1());
            String a1 = sc.next();
            System.out.println("第2个问题:"+ques.getQuestion2());
            String a2 = sc.next();
            System.out.println("第3个问题:"+ques.getQuestion3());
            String a3 = sc.next();
            System.out.println(a1.equals(ques.getAnswer1()));
            if (a1.equals(ques.getAnswer1()) && a2.equals(ques.getAnswer2()) && a3.equals(ques.getAnswer3())){
                System.out.println("验证成功!");
                System.out.println("输入新密码:");
                String new_password = sc.next();
                utils.change_password(name,new_password);
            }
        } else {
            System.out.println("该用户不存在!");
        }
    }
}
