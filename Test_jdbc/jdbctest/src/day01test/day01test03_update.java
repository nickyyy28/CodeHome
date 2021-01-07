package day01test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class day01test03_update {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        Statement statement = null;
        String sql = "update account set balance = 3000";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","200299");
            statement = conn.createStatement();
            int i = statement.executeUpdate(sql);
            System.out.println(i);
            if (i>0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
