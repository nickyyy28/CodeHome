package Test13CreateException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            register(sc.nextLine());
        } catch (RegisterException e) {
            System.out.println("此id已被注册");
        }
    }

    public static void register(String s) throws RegisterException {
        if (s.equals("已注册")){
            throw new RegisterException();
        }
        System.out.println("账号保存");
        System.out.println("注册成功!");
    }
}
