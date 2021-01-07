package day04_examinationSystem;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

public class user {
    private int role;
    protected static JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

}
