package Test15ThreadAndRunnable;

public class Main {
    public static void main(String[] args) {
//        MyThread mt1 = new MyThread("线程1");
//        MyThread mt2 = new MyThread("线程2");
//        MyThread mt3 = new MyThread("线程3");
//        mt1.start();
//        mt2.start();
//        mt3.start();

//        for (int i = 0; i <100 ; i++) {
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        MyThread myThread = new MyThread("");
        myThread.start();
        MyRunAble myRunAble = new MyRunAble();
        Thread thread = new Thread(myRunAble);
        thread.start();
    }
}
