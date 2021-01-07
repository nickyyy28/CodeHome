package day03test;

import EMPer.EMP;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCUtils;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class day03test02 {

    private static JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    //练习1
    @Test
    public void test1(){
        String sql = "update emp set salary = 10000.00 where id = 1001";
        int update = template.update(sql);
        System.out.println(update);
    }

    //练习2
    @Test
    public  void test2(){
        String sql = "insert into emp values(1015,'张飞',4,1009,'2009-6-19',16500.00,null,10)";
        int update = template.update(sql);
        System.out.println(update);
    }

    //练习3
    @Test
    public void test3(){
        String sql = "delete from emp where id = 1015";
        int update = template.update(sql);
        System.out.println(update);
    }

    //练习4
    @Test
    public void test4(){
        String sql = "select * from emp where id = ? ";
        Map<String, Object> map = template.queryForMap(sql, 1001);
        System.out.println(map);
        //{id=1001, ename=孙悟空, job_id=4, mgr=1004, joinday=2000-12-17, salary=10000.00, bouns=null, dept_id=20}
    }

    //练习5
    @Test
    public void test5(){
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        Iterator<Map<String, Object>> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //练习6
    @Test
    public void test6(){
        String sql = "select * from emp";
//        template.query(sql, new RowMapper<EMP>() {
//            @Override
//            public EMP mapRow(ResultSet rs, int i) throws SQLException {
//                return new EMP(
//                        rs.getInt(1),
//                        rs.getString(2),
//                        rs.getInt(3),
//                        rs.getInt(4),
//                        rs.getDate(5),
//                        rs.getDouble(6),
//                        rs.getDouble(7),
//                        rs.getInt(8));
//            }
//        });

        //使用lambda表达式简化
        List<EMP> emps = template.query(sql, (rs, i) ->
                new EMP(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getDate(5),
                        rs.getDouble(6),
                        rs.getDouble(7),
                        rs.getInt(8))
        );
        System.out.println(emps);

    }

    //练习6更简单的方法
    @Test
    public void test6_2(){
        String sql = "select * from emp";
        List<EMP> emps = template.query(sql, new BeanPropertyRowMapper<EMP>(EMP.class));
        for ( EMP emp : emps){
            System.out.println(emp);
        }
    }

    //练习7
    @Test
    public void test7(){
        String sql = "select count(id) from emp";
        Long aLong = template.queryForObject(sql, Long.class);
        System.out.println(aLong);
    }

}
