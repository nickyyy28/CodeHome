package Test15ThreadAndRunnable;

public class MyThread extends Thread {
    public MyThread(String s) {
        setName(s);
    }

    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);
//        Thread t = Thread.currentThread();
//        System.out.println(t);
        System.out.println("这是第一种开启线程的方法");

    }
}
