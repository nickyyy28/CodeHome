package day02test;

import util.JDBCUtils;

import java.sql.*;

public class day02test06_transfer {
    public static void main(String[] args) {
        transfer(2750,2,1);
    }

    public static void transfer(int money,int sendid , int receiveid){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        conn = JDBCUtils.getConnection();
        String sql = "select * from account where id = ?";
        String sql1 = "update account set balance = balance - ? where id = ?";
        String sql2 = "update account set balance = balance + ? where id = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,sendid);
            rs = ps.executeQuery();
            if (rs.next() && rs.getDouble(3) >= money){
                try {
                    conn.setAutoCommit(false);
                    ps1 = conn.prepareStatement(sql1);
                    ps2 = conn.prepareStatement(sql2);
                    ps1.setInt(1,money);
                    ps1.setInt(2,sendid);

                    ps2.setInt(1,money);
                    ps2.setInt(2,receiveid);

                    int i = ps1.executeUpdate();
                    int i1 = ps2.executeUpdate();
                    conn.commit();
                    System.out.println("转账成功!");
                } catch (Exception e) {
                    if (conn != null){
                        try {
                            conn.rollback();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                    System.out.println("转账出现异常!");
                } finally {
                    JDBCUtils.close(ps1,null);
                    JDBCUtils.close(ps2,null);
                }
            } else {
                System.out.println("余额不足!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs,ps,conn);
        }
    }

}
