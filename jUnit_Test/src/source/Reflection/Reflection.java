package source.Reflection;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class.forName("全类名")
        Class cls1 = Class.forName("source.Reflection.Person");
        System.out.println(cls1);

        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);

        //对象名.getClass();
        Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);

        System.out.println(cls1 == cls2); //true
        System.out.println(cls1 == cls3); //true

        /*
        由此得出结论,一个class字节码文件在一次运行时,无论用什么方式获取到的Class类对象都是同一个
         */
    }
}
