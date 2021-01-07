package Test31Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test_use_Stream_data_processing {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("东方不败");
        list1.add("赵敏");
        list1.add("孙刚峰");
        list1.add("周伯通");
        list1.add("令狐冲");
        list1.add("小龙女");

        list2.add("萧峰");
        list2.add("张无忌");
        list2.add("姜铁山");
        list2.add("张三丰");
        list2.add("李廷豹");
        list2.add("黄蓉");
        list2.add("张管家");

        ArrayList<Person> list = new ArrayList<>();
        Stream<String> stream = Stream.concat(list1.stream().filter(a -> a.length() == 3).limit(3),
                list2.stream().filter(a -> a.startsWith("张")).skip(2));
        stream.map((a) -> {
            Person person = new Person();
            person.setName(a);
            return person;
        }).forEach(a -> list.add(a));
        System.out.println(list);
    }
}
