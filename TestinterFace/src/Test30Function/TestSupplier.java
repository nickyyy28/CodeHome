package Test30Function;

import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
//        supplier(() -> "这是字符串");
        int[] arr ={1,2,7,3,4,5,6};
        int cal = cal(() -> {
            int reslut = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= reslut) {
                    reslut = arr[i];
                }
            }
            return reslut;
        });
        System.out.println(cal);
    }

    public static void supplier(Supplier<String> supplier){
        String s = supplier.get();
        System.out.println(s);
    }

    public static int cal(Supplier<Integer> sup ){
        return sup.get();
    }
}
