package Test30Function;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        String s = "120";
        int i = Function_apply(s, a -> Integer.parseInt(a));
        System.out.println(i);

        String s1 = Function_andThen(s, a -> Integer.parseInt(a)+10 , a -> a + "");
        System.out.println(s1);
    }

    public static int Function_apply(String s, Function<String,Integer> fun){
        return fun.apply(s);
    }

    public static String Function_andThen(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        return fun1.andThen(fun2).apply(s);
    }
}
