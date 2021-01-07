package day01test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class day01test05_create_table {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        String sql = "create table jdbc_table(id int primary key auto_increment, name varchar(10) )";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","200299");
            statement = conn.createStatement();

            int count = statement.executeUpdate(sql);
            System.out.println(count);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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
