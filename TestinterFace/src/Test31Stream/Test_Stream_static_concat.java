package Test31Stream;

import java.util.stream.Stream;

public class Test_Stream_static_concat {
    public static void main(String[] args) {
        String[] arr1 ={"1","2","3","4","5","6"};
        Stream<String> stream1 = Stream.of(arr1);

        String[] arr2 = {"喜羊羊","美羊羊"};
        Stream<String> stream2 = Stream.of(arr2);

        Stream.concat(stream1,stream2).forEach(a -> System.out.println(a));
     }
}
