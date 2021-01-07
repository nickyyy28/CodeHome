package Test11;

import java.util.Collections;
import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Person,String> list = new HashMap<>();
        list.put(new Person("张三",18),"北京");
        list.put(new Person("李四",19),"上海");
        list.put(new Person("王五",20),"杭州");
        list.put(new Person("张三",25),"武汉");
        for (Person p:list.keySet()){
            System.out.println(p+list.get(p));
        }

    }
}
