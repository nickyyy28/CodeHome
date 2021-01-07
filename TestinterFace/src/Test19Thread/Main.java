package Test19Thread;



public class Main {
    public static void main(String[] args) {
        Object obj = new Object();  //创建锁对象,保证唯一
        //创建顾客线程
        new Thread(new Runnable() {
            @Override
            public void run() {
//                synchronized (obj){
//                    System.out.println("告诉老板要买的包子的数量和种类");
//                    try {
//                        obj.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("包子做好了,开吃");
//                    System.out.println("===============================");
//                }
                while (true){
                    synchronized (obj){
                        System.out.println("告诉老板要买的包子的数量和种类");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好了,开吃");
                        System.out.println("===============================");
                    }
                }
            }
        }).start();
        //创建老板线程
        new Thread(new Runnable() {
            @Override
            public void run() {
//                synchronized (obj){
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("包子做好了");
//                    obj.notify();
//                }
                while (true){
                    synchronized (obj){
                        System.out.println("好嘞,收到");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好了");
                        obj.notify();
                    }
                }
            }
        }).start();
    }
}
