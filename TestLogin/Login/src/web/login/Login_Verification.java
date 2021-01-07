package web.login;

import objects.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

import java.util.List;
import java.util.Map;

/**
 * @author 30929
 */
public class Login_Verification {
    private static JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    public static User getUser(String username , String password){

        String sql = "select * from user where name = ? and password = ?";
        User user1 = null;

        try {
            user1 = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
        return user1;
    }

    public static boolean isExist(String username , String password){
        String sql = "select * from user where name = ? and password = ?";

//        Map<String, Object> map = template.queryForMap(sql, username, password);
        List<Map<String, Object>> list = template.queryForList(sql, username, password);

        if(list.size() == 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "zhangsanfeng";
        String password = "1223456";
        if (Login_Verification.isExist(name,password)){
            System.out.println("用户存在");
        } else {
            System.out.println("用户不存在");
        }
    }
}
