package Test8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList list3 = new ArrayList();
        list1.add("obj");
        list1.add("abc");

        list2.add(12);
        list2.add(15);

        list3.add("fafda");
        list3.add(14);
        list3.add(true);


        Generic.printarray(list1);
//        Generic.printarray(list2);
//        Generic.printarray(list3);
    }
}
