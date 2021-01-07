package Test15ThreadAndRunnable;

public class MyRunAble implements Runnable {

    Object obj;
    @Override
    public void run() {
        synchronized (obj){
            int number = 2000;
            for (int i = 0 ; i < number ; i++){
                System.out.println(i+"-"+Thread.currentThread().getName());
            }
        }
    }
}
