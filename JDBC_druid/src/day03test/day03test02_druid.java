package day03test;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class day03test02_druid {
    public static void main(String[] args) throws Exception {
        Properties pro  = new Properties();
        ClassLoader classLoader = day03test02_druid.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("druid.properties");
        pro.load(is);
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
