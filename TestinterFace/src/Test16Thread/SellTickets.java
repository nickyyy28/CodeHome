package Test16Thread;

public class SellTickets implements Runnable {
    private  int tickets=1000;
    Object object = new Object();
    @Override
    public void run() {
        method();
    }

    public synchronized void method(){
        while (true){
            if (tickets>0){
                System.out.println("这是窗口"+Thread.currentThread().getName()+"卖的第"+tickets+"张票");
                tickets--;

            }else {
//                if (Thread.currentThread().getName().equals("Thread-2")){
                    System.out.println("票卖完了!");
//                }
                break;
            }
        }
    }
}
