package day03test;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

public class day03test01_SpringJDBC_Template {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "insert into stu values(null,?,?)";
        int count = template.update(sql, "张三", 17);
        System.out.println(count);
    }
}
