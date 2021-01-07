package day03test;

import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class day03test03_druid_utils {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            String sql = "insert into account values(null,?,?)";
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,"zhaosi");
            ps.setDouble(2,4500);

            int i = ps.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(ps,conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
