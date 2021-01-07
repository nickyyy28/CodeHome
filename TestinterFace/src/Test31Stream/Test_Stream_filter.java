package Test31Stream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test_Stream_filter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("周芷若");
        list.add("赵敏");
        list.add("东方不败");
        list.stream().filter(a -> a.startsWith("张"))
                .filter(a -> a.length() == 3)
                .forEach(a -> System.out.println(a));


    }
}
