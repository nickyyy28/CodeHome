package day01test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class day01test02_insert {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "insert into account values(null,'wangwu',1000)";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "200299");
            statement = conn.createStatement();
            int i = statement.executeUpdate(sql);
            System.out.println(i);
            if (i>0){
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
