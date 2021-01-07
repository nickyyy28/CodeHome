package Test31Stream;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.Stream;

public class Test_Stream_limit {
    public static void main(String[] args) {
        String[] arr ={"1","2","3","4","5","6"};

        Stream<String> stream = Stream.of(arr);
        stream.limit(4).forEach( a -> System.out.println(a));
    }
}
