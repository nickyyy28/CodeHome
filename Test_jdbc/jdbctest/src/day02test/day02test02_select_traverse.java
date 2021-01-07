package day02test;

import java.sql.*;

public class day02test02_select_traverse {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        String sql = "select * from account";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","200299");
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);

//            rs.next();
            int anInt;
            String string;
            double aDouble;

            while (rs.next()){
                anInt = rs.getInt(1);
                string = rs.getString(2);
                aDouble = rs.getDouble(3);
                System.out.println("id:"+anInt+"\t"+"姓名:"+string+"\t"+"工资:"+aDouble);
                rs.next();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

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
