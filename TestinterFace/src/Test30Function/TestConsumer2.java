package Test30Function;

import java.util.function.Consumer;

public class TestConsumer2 {
    public static void main(String[] args) {
        String[] arr ={"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
        for ( String s : arr){
            method(s,add((a) -> System.out.println(a.split(",")[0]) ,
                    (a) -> System.out.println(a.split(",")[1])));
        }
    }

    public static void method(String t, Consumer<String> consumer){
        consumer.accept(t);
    }

    public static Consumer<String> add(Consumer<String> c1,Consumer<String> c2){
        return c1.andThen(c2);
    }
}
