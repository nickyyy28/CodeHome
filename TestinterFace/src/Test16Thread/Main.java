package Test16Thread;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类的多线程开启1");
            }
        });
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("匿名内部类的多线程开启2");
            }
        };
        thread.start();
        thread1.start();
    }
}
