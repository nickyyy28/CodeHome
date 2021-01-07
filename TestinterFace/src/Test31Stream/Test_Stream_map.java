package Test31Stream;

import java.util.stream.Stream;

public class Test_Stream_map {
    public static void main(String[] args) {
        String[] arr ={"1","2","3","4","5","6"};
        Stream<String> stream = Stream.of(arr);

        stream.map( a -> Integer.parseInt(a) + 20).forEach(a -> System.out.println(a));
    }
}
