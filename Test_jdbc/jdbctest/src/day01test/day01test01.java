package day01test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class day01test01 {
    public static void main(String[] args) throws Exception {
        // 导入驱动jar包
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库连接对象
        Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "200299");
        //定义sql语句
        String sql = "update account set balance = 500 where id = 1";
        //获取执行sql的对象
        Statement statement = root.createStatement();
        //执行sql
        int i = statement.executeUpdate(sql);
        //处理结果
        System.out.println(i);
        //释放资源
        statement.close();
        root.close();
    }
}
