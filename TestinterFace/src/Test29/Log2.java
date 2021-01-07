package Test29;

public class Log2 {
    public static void main(String[] args) {
        String message1 = "Hello";
        String message2 = "World";
        String message3 = "Java";
//        log(2,(message1,message2,message3) -> message1+message2+message3);
//        log(1, new Pingjie() {
//            @Override
//            public String ping(String... a) {
//                StringBuilder su = null;
//                for (int i = 0; i <a.length ; i++) {
//                    su.append(a[i]);
//                }
//                return su.toString();
//            }
//        });
        long s = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            if (i%3 == 0){
                log(1, () -> message1+message2+message3 );
            }else {
                log(2, () -> message1+message2+message3 );
            }
        }
        long e = System.currentTimeMillis();
        System.out.println("一共花了"+(e-s)+"毫秒");
    }

    public static void log(int level, Pingjie pingjie){
        if (level == 1){
            System.out.println(pingjie.ping());
        }
    }
}
