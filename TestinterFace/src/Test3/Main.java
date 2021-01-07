package Test3;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String s = "123";
        String s1= s;
        String s2 = "123";

         System.out.println(Objects.equals(s,s1));
    }
}
