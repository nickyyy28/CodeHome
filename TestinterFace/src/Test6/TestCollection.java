package Test6;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("123");
        col.add("hello");
        col.add("world");
        boolean s = ((ArrayList)col).remove("123");
        ((ArrayList<String>) col).remove(0);

        ArrayList<String> col2 = new ArrayList<>();

        col2.add("123");
        col2.add("hello");
        col2.add("world");


        System.out.println(s);
    }
}
