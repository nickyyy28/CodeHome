package day03test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class day03test01_c3p0 {
    public static void main(String[] args) throws SQLException {
        DataSource ds = new ComboPooledDataSource();

        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
