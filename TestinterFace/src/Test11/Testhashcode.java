package Test11;

import java.util.ArrayList;

public class Testhashcode {
    public static void main(String[] args) {
        Testhashcode testhashcode = new Testhashcode();
        System.out.println(testhashcode.hashCode());
        ArrayList<ArrayList<String>> doubleArrray = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            list1.add(i+"");
            list2.add(i+"");
            list3.add(i+"");
        }

        doubleArrray.add(list1);

    }
}
