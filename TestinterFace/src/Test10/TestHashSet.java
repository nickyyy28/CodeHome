package Test10;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("qwf");                             //添加元素
        System.out.println(set.contains("qwf"));    //判断集合中有没有某个元素

    }
}
