package source.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflect_Class_Get {
    public static void main(String[] args) throws Exception {
        method3();
    }



    public static void method1() throws Exception {
        //0.获取Person的class对象
        Class<Person> cls = Person.class;
        Person p = new Person("古力娜扎",25,"test1");//定义一个Person对象
        System.out.println("============================");
        //1.获取成员变量
        Field[] fields = cls.getFields();  //获取所有public的成员变量

        //        public String a;          只会获取到public的a,其他三个获取不到
        //        protected  String b;
        //        String c;
        //        private String d;
        for (Field f : fields){
            System.out.println(f);
        }//public java.lang.String source.Reflection.Person.a

        System.out.println("------------------------");

        Field a = cls.getField("a");  //获取指定名称的public成员变量
        System.out.println(a);//public java.lang.String source.Reflection.Person.a

        System.out.println("------------------------");

        Object value = a.get(p);
        System.out.println(value);//test1

        a.set(p,"test2");//设置a的值为"test2"
        value = a.get(p);
        System.out.println(value);//test2

        System.out.println("=============================");

        Field[] declaredFields = cls.getDeclaredFields();//获取所有的成员变量,无论是不是public
        for (Field field:declaredFields){
            System.out.println(field);
//            private java.lang.String source.Reflection.Person.name
//            private int source.Reflection.Person.age
//            public java.lang.String source.Reflection.Person.a
//            protected java.lang.String source.Reflection.Person.b
//            java.lang.String source.Reflection.Person.c
//            private java.lang.String source.Reflection.Person.d
        }

        System.out.println("------------------------");

        Field a1 = cls.getDeclaredField("a");//获取指定名称的成员变量
        System.out.println(a1);//public java.lang.String source.Reflection.Person.a

        System.out.println("------------------------");

//        Field name = cls.getDeclaredField("name");//获取私有的name
//        System.out.println(name.get(p));//会报错非法访问,Exception in thread "main" java.lang.IllegalAccessException

        Field name = cls.getDeclaredField("name");//获取私有的name
        name.setAccessible(true);//暴力反射,忽略访问权限的安全检查
        System.out.println(name.get(p));//古力娜扎
    }

    //获取构造方法,用来创建对象
    private static void method2() throws Exception{
        Class<Person> personClass = Person.class;
        Person person = new Person("迪丽热巴",27);
        System.out.println("========================");

        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);//public source.Reflection.Person(java.lang.String,int)

        System.out.println("----------------------");

        Person person1 = constructor.newInstance("张三", 35);//创建对象
        System.out.println(person1);//Person{name='张三', age=35, a='null', b='null', c='null', d='null'}

//        Person person2 = personClass.newInstance();//通过class对象直接创建Person对象,已过时
        System.out.println("---------------------------");


        /*
        后续等方法:
        Constructor<?>[] constructors = personClass.getConstructors();//获取public的构造器数组
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor();//获取指定名称的构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();//获取所有构造器
        注意:若使用非public的构造器对象创建Person对象时需使用setAccessible(true);暴力反射,忽略访问权限的安全检查
         */
    }

    //获取成员方法
    public static void method3() throws Exception{
        Class<Person> personClass = Person.class;
        Person person = new Person("李四",17);

        System.out.println("=========================");

        Method eat1 = personClass.getMethod("eat");
        Method eat2 = personClass.getMethod("eat", String.class);
        personClass.getMethods();
        Method sleep = personClass.getDeclaredMethod("sleep");
        personClass.getDeclaredMethods();

        eat1.invoke(person);
        eat2.invoke(person,"饭");

    }
}
