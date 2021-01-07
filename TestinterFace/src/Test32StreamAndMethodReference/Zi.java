package Test32StreamAndMethodReference;

import java.util.function.Consumer;

public class Zi extends Fu {
    public static void main(String[] args) {
        String s = "Mack";
//        print(s,s1 -> super.sayhello(s1));
        Zi zi = new Zi();
        zi.method1(s);
        zi.method2(s);
    }

    @Override
    public void sayhello(String s) {
        System.out.println("这是子类"+s);
    }

    private static void print(String s, Consumer<String> con){
        con.accept(s);
    }

    public void method1(String s){
        print(s , super::sayhello);
    }

    public void method2(String s){
        print(s , this::sayhello);
    }
}
