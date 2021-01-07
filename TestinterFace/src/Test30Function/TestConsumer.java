package Test30Function;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        method("ad",(t) -> System.out.println(new StringBuilder().append(t).reverse().toString()));

        method("Hello",add((c) -> System.out.println(c) ,
                (c) -> System.out.println(new StringBuilder().append(c).reverse().toString())));
    }

    public static void method(String t,Consumer<String> consumer){
        consumer.accept(t);
    }

    public static Consumer<String> add(Consumer<String> c1,Consumer<String> c2){
        return c1.andThen(c2);
    }
}
