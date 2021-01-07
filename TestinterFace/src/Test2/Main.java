package Test2;

public class Main {

    public void print(Interface obj){
        obj.method();
    }
    public static void main(String[] args) {
        Interface obj = new Interface() {
            @Override
            public void method() {
                System.out.println("匿名内部类方法重写");
            }
        };
        obj.method();
        Main main = new Main();
        main.print(new Interface() {
            @Override
            public void method() {
                System.out.println("匿名内部类方法重写");
            }
        });

    }
}
