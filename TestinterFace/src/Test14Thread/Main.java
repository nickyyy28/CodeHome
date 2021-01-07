package Test14Thread;

public class Main {
    public static void main(String[] args) {
        MyThread f1 = new MyThread();
        f1.start();
        Person p1 = new Person("李华");
        p1.print();

    }
}
