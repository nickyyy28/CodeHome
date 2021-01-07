package Test15ThreadAndRunnable;

public class Main2 {
    public static void main(String[] args) {
        MyRunAble myRunAble = new MyRunAble();
        Thread th1 = new Thread(myRunAble);
        Thread th2 = new Thread(myRunAble);
        Thread th3 = new Thread(myRunAble);

        th1.start();
        th2.start();
        th3.start();
    }
}
