package source.Reflection;

public class Person {
    private String name;
    private int age;

    public String a;
    protected  String b;
    String c;
    private String d;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age , String a) {
        this.name = name;
        this.age = age;
        this.a = a;
    }

    @Deprecated
    public void eat(){
        System.out.println("吃.....");
    }

    public void eat(String s){
        System.out.println("吃....."+s);
    }

    private void sleep(){
        System.out.println("睡.....");
    }
}
