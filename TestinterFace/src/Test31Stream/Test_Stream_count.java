package Test31Stream;

import java.util.stream.Stream;

public class Test_Stream_count {
    public static void main(String[] args) {
        String[] arr ={"1","2","3","4","5","6"};
        Stream<String> stream = Stream.of(arr);

        long count = stream.count();
        System.out.println(count);
    }
}
