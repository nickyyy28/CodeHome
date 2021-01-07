package web.login;


import objects.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class BeanUtilsTest {

    @Test
    public void Beantest(){
        User user = new User();
        try {
            BeanUtils.setProperty(user,"username","zhangsanfeng");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        
        System.out.println(user);
    }
}
