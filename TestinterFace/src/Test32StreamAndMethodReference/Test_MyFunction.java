package Test32StreamAndMethodReference;

public class Test_MyFunction {
    public static void main(String[] args) {
        String s = "hhhhc";
        run(s,System.out::println);
    }

    public  static <M> void run(M m ,MyFunction<M> mf){
        mf.print(m);
    }
}
