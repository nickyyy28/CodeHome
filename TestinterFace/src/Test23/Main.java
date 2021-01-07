package Test23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("迪丽热巴",18));
        list.add(new Person("马儿扎哈",20));
        list.add(new Person("古力娜扎",17));

        Collections.sort(list);

        Person[] array = {
                new Person("迪丽热巴",18),
                new Person("马儿扎哈",20),
                new Person("古力娜扎",17)
        };
        //普通排序
//        Arrays.sort(array, new Comparator<Person >() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        //Lambda排序
        Arrays.sort(array,( o1,  o2)-> o1.getAge()-o2.getAge());  //省略
        System.out.println(list);
        for (Person p: array) {
            System.out.println(p);
        }
    }
}
