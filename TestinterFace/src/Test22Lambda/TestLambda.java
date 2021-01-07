package Test22Lambda;

public class TestLambda {
    public static void main(String[] args) {
        //使用匿名内部类的形式创建新线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建新线程");
            }
        }).start();
        //使用Lambda表达式实现多线程
        new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"创建新线程");
            }
        ).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"创建新线程");
        }

        ).start();
//        TestMyInterface.print(() -> {
//            System.out.println("MyLanbda");
//        });
        TestMyInterface testMyInterface = new TestMyInterface();
        testMyInterface.print(() ->{
            System.out.println("MyLanbda");
        });
    }
}
