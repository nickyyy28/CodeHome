package day02test;

import EMPer.EMP;
import util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class day02test03 {
    public static void main(String[] args) {
        List<EMP> list = findAll2();
        System.out.println(list);
    }
    public static List<EMP> findAll(){
        ArrayList<EMP> list = new ArrayList<EMP>();
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        String sql = "select * from emp";
        int id;
        String ename = "";
        int job_id;
        int mqr;
        Date join_day;
        double salary;
        double bouns;
        int dept_id;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","200299");

            statement = conn.createStatement();

            rs = statement.executeQuery(sql);

            while (rs.next()){
                id = rs.getInt("id");
                ename = rs.getString("ename");
                job_id = rs.getInt("job_id");
                mqr = rs.getInt("mqr");
                join_day = rs.getDate("joinday");
                salary = rs.getDouble("salary");
                bouns = rs.getDouble("bouns");
                dept_id = rs.getInt("dept_id");
                list.add(new EMP(id,ename,job_id,mqr,join_day,salary,bouns,dept_id));
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
        return list;
    }

    public static List<EMP> findAll2(){
        ArrayList<EMP> list = new ArrayList<EMP>();
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        String sql = "select * from emp";
        int id;
        String ename = "";
        int job_id;
        int mqr;
        Date join_day;
        double salary;
        double bouns;
        int dept_id;
        try {
            conn = JDBCUtils.getConnection();

            statement = conn.createStatement();

            rs = statement.executeQuery(sql);

            while (rs.next()){
                id = rs.getInt("id");
                ename = rs.getString("ename");
                job_id = rs.getInt("job_id");
                mqr = rs.getInt("mqr");
                join_day = rs.getDate("joinday");
                salary = rs.getDouble("salary");
                bouns = rs.getDouble("bouns");
                dept_id = rs.getInt("dept_id");
                list.add(new EMP(id,ename,job_id,mqr,join_day,salary,bouns,dept_id));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs,statement,conn);
        }
        return list;
    }
}
