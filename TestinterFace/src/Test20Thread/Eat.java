package Test20Thread;

public class Eat extends Thread {
    private Object object;
    private Baozi baozi;
    public Eat(Object object,Baozi baozi) {
        this.object = object;
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (object){
                if (baozi.isIsexist()==false){
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("正在吃包子");
                baozi.setIsexist(false);
                object.notify();
                System.out.println("包子吃完了,开始生产包子");
                System.out.println("===============================");
            }
        }
    }

    @Override
    public String toString() {
        return "Eat{" +
                "baozi=" + baozi +
                '}';
    }
}
