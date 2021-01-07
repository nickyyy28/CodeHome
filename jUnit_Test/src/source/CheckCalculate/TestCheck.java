package source.CheckCalculate;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestCheck {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(
                        new File("bug.txt")
                ),"utf-8"));
        Properties pro = new Properties();
        ClassLoader classLoader = TestCheck.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("check.properties");

        pro.load(is);
        String className = pro.getProperty("className");

        //创建一个对象
        Class<?> aClass = Class.forName(className);

        Constructor<?> constructor = aClass.getConstructor();

        Object o = constructor.newInstance();
//        System.out.println(o.toString());

        Method[] methods = o.getClass().getMethods();
//        System.out.println(methods.length);
        int number = 0;
        for (Method method : methods){
            if (method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(o);
                }catch (Exception e){
                    number++;
                    bw.write(method.getName()+"方法出异常了!");
                    bw.newLine();
                    bw.write("异常的名称:"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因:"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-----------------------------");
                    bw.newLine();
                    bw.flush();
                }
            }
        }
        bw.newLine();
        bw.write("本次测试一共出现"+number+"次异常");
        bw.close();
    }
}
