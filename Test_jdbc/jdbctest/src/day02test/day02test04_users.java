package day02test;

import util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class day02test04_users {
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
        String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,statement,conn);
//            System.out.println("我是finally中的代码");
        }
        return reslut;
    }
}
