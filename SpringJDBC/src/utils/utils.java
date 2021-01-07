package utils;

import day04_examinationSystem.question;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class utils {
    public static int findid(String name){
        int result = 0;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from user where name = ?";
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1,name);
            rs = ps.executeQuery();
            rs.next();
            result = rs.getInt("id");
            return result;
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(rs,ps,connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static boolean isexits(String name){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from user where name = ?";
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1,name);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(rs,ps,connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isexits("杨过"));
    }

    public static boolean user_is_exists(String name,String password){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from user where name = ? and password = ?";
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,password);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(rs,ps,connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static void change_password(String name,String new_password){
        String sql = "update user set password = ? where name = ?";
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        template.update(sql,new_password,name);
        System.out.println("密码修改成功!");
    }

    public static question return_question(int user_id){
        question q1 = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from question where user_id = ?";
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1,user_id);
            rs = ps.executeQuery();
            rs.next();
            q1 = new question();
            q1.setId(rs.getInt("id"));
            q1.setQuestion1(rs.getString("Question1"));
            q1.setQuestion2(rs.getString("Question2"));
            q1.setQuestion3(rs.getString("Question3"));
            q1.setAnswer1(rs.getString("answer1"));
            q1.setAnswer2(rs.getString("answer2"));
            q1.setAnswer3(rs.getString("answer3"));
            q1.setUser_id(rs.getInt("user_id"));
            return q1;
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(rs,ps,connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return q1;
    }
}
