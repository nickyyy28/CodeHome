package Test20Thread;

public class Main {
    public static void main(String[] args) {
        Baozi o = new Baozi("meat");
        Object obj = new Object();
        Sell sell = new Sell(obj, o);
        Eat eat = new Eat(obj, o);
//        System.out.println(sell);
//        System.out.println(eat);
        eat.start();
        sell.start();
    }

    public static void wait1() throws InterruptedException {
        Thread.sleep(1000);
    }
}
