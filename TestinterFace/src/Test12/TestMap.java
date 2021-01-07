package Test12;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("aaa","aaa");
        map.put("bbb","bbb");
        map.put("ccc","ccc");
        for (String s: map.keySet()) {
            System.out.println(s+"="+map.get(s));
        }
        System.out.println("========================");
        for (Map.Entry s: map.entrySet()) {
            System.out.println(s);
        }
    }
}
