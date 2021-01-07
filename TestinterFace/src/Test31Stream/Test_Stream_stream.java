package Test31Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Test_Stream_stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        HashMap<String,Integer> hashMap = new HashMap<>();
        Stream<String> stream2 = hashMap.keySet().stream();

        Stream<Map.Entry<String, Integer>> stream3 = hashMap.entrySet().stream();

        Integer[] arr1 = {1,3,5,7,9};
        Stream<Integer> stream4 =Stream.of(arr1);

        stream4.filter( a -> a<6).forEach(a -> System.out.println(a));


    }


}
