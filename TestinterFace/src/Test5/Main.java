package Test5;

public class Main {
    public static void main(String[] args) {
        long a1 = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long a2 = System.currentTimeMillis();

        System.out.println("共耗时"+(a2-a1)+"毫秒");
    }
}
