package source.Annotation;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;
@Pro(className = "source.Reflection.Person",MethodName = "eat")
public class Reflection_Frame {
    public static void main(String[] args) throws Exception {
        Class<Reflection_Frame> aClass = Reflection_Frame.class;
        Pro pro = aClass.getAnnotation(Pro.class);

        Class<?> aClass1 = Class.forName(pro.className());

        Constructor<?> constructor = aClass1.getConstructor(String.class,int.class);
        Object o = constructor.newInstance("adad",12);
        System.out.println(o);
    }


}
