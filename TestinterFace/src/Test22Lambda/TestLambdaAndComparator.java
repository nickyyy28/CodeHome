package Test22Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class TestLambdaAndComparator {
    public static void main(String[] args) {
        String[] arr = {"aaa","b","ccccc","ddddddddd"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,comparator());
        System.out.println(Arrays.toString(arr));
    }

    public static Comparator<String> comparator(){
        return (o1, o2) -> o2.length()-o1.length() ;
    }
}
