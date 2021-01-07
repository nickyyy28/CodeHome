package Test18Lock;


import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class TestLock implements Runnable {
    private int tickets=100;
    ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
//        reentrantLock.lock();
//        while (true){
//            if (tickets>0){
//                System.out.println("这是窗口"+Thread.currentThread().getName()+"卖的第"+tickets+"张票");
//                tickets--;
//            }else{
//                if (Thread.currentThread().getName().equals("Thread-0")){
//                    System.out.println("票卖完了!");
//                }
//                break;
//            }
//        }
//        reentrantLock.unlock();
        while (true){
            reentrantLock.lock();
            if (tickets>0){
                System.out.println("这是窗口"+Thread.currentThread().getName()+"卖的第"+tickets+"张票");
                tickets--;
            }else{
                if (Thread.currentThread().getName().equals("Thread-0")){
                    System.out.println("票卖完了!");
                }
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }

    }
}
