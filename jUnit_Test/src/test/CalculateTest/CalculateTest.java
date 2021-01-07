package test.CalculateTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import source.Calculate.Calculate;

public class CalculateTest {

    /*
    初始化方法
    所有方法执行前都会执行
     */
    @Before
    public void init(){
        System.out.println("init.....");
    }

    @Test
    public void testadd(){
        System.out.println("testadd.....");
        Assert.assertEquals(3, Calculate.add(1,2));
    }

    @Test
    public void testsub(){
        System.out.println("testsub.....");
        Assert.assertEquals(5,Calculate.sub(7,2));

    }

    /*
    资源释放方法
    所有方法执行之后才会执行
     */
    @After
    public void colse(){
        System.out.println("close......");
    }
}
