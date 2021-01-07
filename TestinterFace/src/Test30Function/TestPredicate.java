package Test30Function;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        System.out.println(judgment("aaa", s -> s.equals("aaa")));
        String s="albc";

        boolean c = Predicate_and(s, a -> a.length() >= 5, a -> a.endsWith("c"));
        System.out.println(c);

        boolean d = Predicate_or(s, a -> a.length() >= 5, a -> a.endsWith("c"));
        System.out.println(d);

        boolean e = Predicate_negate(s, a -> a.length()<5);
        System.out.println(e);
    }

    public static boolean judgment(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static boolean Predicate_and(String s,Predicate<String> pre1 , Predicate<String> pre2){
        return pre1.and(pre2).test(s);
    }

    public static boolean Predicate_or(String s,Predicate<String> pre1 , Predicate<String> pre2){
        return pre1.or(pre2).test(s);
    }

    public static boolean Predicate_negate(String s , Predicate<String> pre){
        return pre.negate().test(s);
    }
}
