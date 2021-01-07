package Test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n"+hailstone(sc.nextInt()));
    }
    public static int hailstone(int a){
        int lenght=0;
        while (a>1){
            if (a%2==0){
                a/=2;
            }else {
                a=3*a+1;
            }
            lenght++;
            System.out.printf("%d\t",a);
        }
        return lenght;
    }
}
