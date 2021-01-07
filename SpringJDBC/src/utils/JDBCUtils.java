package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource ds;

    static {
        Properties pro = new Properties();
        try {
            pro.load(JDBCUtils.class.getClassLoader().
                    getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    public static void close(ResultSet rs , Statement statement, Connection conn) throws SQLException {
        if (rs != null){
            rs.close();
        }

        if (statement != null){
            statement.close();
        }

        if (conn != null){
            conn.close();
        }
    }

    public static void close(Statement statement, Connection conn) throws SQLException {
        close(null,statement,conn);
    }

    public static DataSource getDataSource(){
        return ds;
    }
}
