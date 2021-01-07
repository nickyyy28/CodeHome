package Test30Function;

import java.util.function.Function;

public class TestFunciton2 {
    public static void main(String[] args) {
        String s = "赵丽颖,20";
        int i = method(s, a -> Integer.parseInt(a.split(",")[1]) + 100);
        System.out.println(i);
    }
    public static int method(String s, Function<String,Integer> fun){
        return fun.apply(s);
    }
}
