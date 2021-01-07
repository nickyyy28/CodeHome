package day04_examinationSystem;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

import java.util.Scanner;

public class question {
    private int id;
    private String Question1;
    private String Question2;
    private String Question3;
    private String answer1;
    private String answer2;
    private String answer3;
    private int user_id;

    public question() {
    }

    public question(int id, String question1, String question2, String question3, String answer1, String answer2, String answer3, int user_id) {
        this.id = id;
        this.Question1 = question1;
        this.Question2 = question2;
        this.Question3 = question3;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getQuestion1() {
        return Question1;
    }

    public void setQuestion1(String question1) {
        Question1 = question1;
    }

    public String getQuestion2() {
        return Question2;
    }

    public void setQuestion2(String question2) {
        Question2 = question2;
    }

    public String getQuestion3() {
        return Question3;
    }

    public void setQuestion3(String question3) {
        Question3 = question3;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public static void setQuestion(int user_id){
        Scanner sc = new Scanner(System.in);
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "insert into question (Question1,Question2,Question3,answer1,answer2,answer3,user_id) values" +
                "(?,?,?,?,?,?,?)";
        System.out.println("请输入问题1:");
        String Question1 = sc.next();
        System.out.println("请输入回答1:");
        String answer1 = sc.next();
        System.out.println("请输入问题2:");
        String Question2 = sc.next();
        System.out.println("请输入回答2:");
        String answer2 = sc.next();
        System.out.println("请输入问题3:");
        String Question3 = sc.next();
        System.out.println("请输入回答3:");
        String answer3 = sc.next();
        template.update(sql,Question1,Question2,Question3,answer1,answer2,answer3,user_id);
    }
}
