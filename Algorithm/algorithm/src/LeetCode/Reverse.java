package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public int reverse(int x){
        String s = null;
        if (x>0){
            s = new StringBuffer().append(x+"").reverse().toString();
            if (!isOutOfBound(s)){
                return Integer.parseInt(s.substring(0,s.length()));
            } else {
                return 0;
            }
        } else if (x == -2147483648) {
            return 0;
        } else {
            s = new StringBuffer().append((-1)*x+"").reverse().toString();
            if (!isOutOfBound(s)){
                return (-1)*Integer.parseInt(s.substring(0,s.length()));
            } else {
                return 0;
            }
        }
    }

    public static boolean isOutOfBound(String s){
        Long l = Long.parseLong(s);
        if (l < Integer.MAX_VALUE){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = reverse.reverse(num);
        System.out.println(i);
        System.out.println(isOutOfBound("2147483651"));
    }
    public <M> ArrayList<M> method(M m){
        ArrayList<M> ms = new ArrayList<>();
        ms.add(m);
        return ms;
    }
}
