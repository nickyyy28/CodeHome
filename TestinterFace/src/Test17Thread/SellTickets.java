package Test17Thread;

public class SellTickets implements Runnable {
    private  int tickets=10000;
    Object object = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (object){
                if (tickets>0){
                    System.out.println("这是窗口"+Thread.currentThread().getName()+"卖的第"+tickets+"张票");
                    tickets--;
                }else {
                    if (Thread.currentThread().getName().equals("Thread-2")){
                        System.out.println("票卖完了!");
                    }
                    break;
                }
            }
        }
    }
}
