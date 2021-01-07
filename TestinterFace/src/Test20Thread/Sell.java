package Test20Thread;

public class Sell extends Thread{
    private Object object;
    private Baozi baozi;
    public Sell(Object object,Baozi baozi) {
        this.object = object;
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (object){
                if (baozi.isIsexist()){
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("现在开始做包子");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("现在做好了!");
                baozi.setIsexist(true);
                object.notify();
                System.out.println("已经生产好包子了");
            }
        }

    }

    @Override
    public String toString() {
        return "Sell{" +
                "baozi=" + baozi +
                '}';
    }
}
