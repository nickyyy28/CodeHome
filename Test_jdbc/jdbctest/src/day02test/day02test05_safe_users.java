package day02test;

import util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class day02test05_safe_users {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        boolean login = login(username, password);
        if (login){
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
    }

    public static boolean login(String username,String password) {
        boolean reslut = false;
        if (username == null || password == null){
            return reslut;
        }
        String sql = "select * from user where username = ? and password = ?";
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            rs = preparedStatement.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,preparedStatement,conn);
//            System.out.println("我是finally中的代码");
        }
        return reslut;
    }
}
