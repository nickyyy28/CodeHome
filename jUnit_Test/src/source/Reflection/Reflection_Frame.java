package source.Reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection_Frame {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
//        pro.load(new FileInputStream("pro.properties"));

        ClassLoader classLoader = Reflection_Frame.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");

        pro.load(is);
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("MethodName");

        Class<?> aClass = Class.forName(className);
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();
        Method method = aClass.getMethod(methodName);

        method.invoke(o);
    }
}
