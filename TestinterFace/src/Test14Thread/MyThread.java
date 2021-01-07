package Test14Thread;

public class MyThread extends Thread {
    @Override
    public void run() {

        Person p2 = new Person("小明");
        p2.print();
    }
}
