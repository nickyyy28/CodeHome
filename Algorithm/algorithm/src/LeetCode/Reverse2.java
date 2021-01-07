package LeetCode;

import java.util.Scanner;

public class Reverse2 {
    public int reverse(int x){
        String s = new StringBuffer().append(Math.abs(x)+"").reverse().toString();
        if (x>0){
            int i;
            try {
                i = Integer.parseInt(s);
            } catch (Exception e){
                return 0;
            }
            return i;
        }else {
            int i;
            try {
                i = Integer.parseInt(s);
            } catch (Exception e){
                return 0;
            }
            return (-1)*i;
        }
    }

    public static void main(String[] args) {
        Reverse2 reverse = new Reverse2();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = reverse.reverse(num);
        System.out.println(i);
    }
}
