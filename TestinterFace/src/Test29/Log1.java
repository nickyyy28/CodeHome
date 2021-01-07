package Test29;

public class Log1 {
    public static void main(String[] args) {
        String message1 = "Hello";
        String message2 = "World";
        String message3 = "Java";
        long s = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            if (i%3 == 0){
                log(1,message1+message2+message3);
            }else {
                log(2,message1+message2+message3);
            }
        }
        long e = System.currentTimeMillis();
        System.out.println("一共花了"+(e-s)+"毫秒");
    }

    public static void log(int level, String s){
        if (level == 1){
            System.out.println(s);
        }
    }
}
