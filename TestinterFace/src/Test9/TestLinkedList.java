package Test9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Vector vector = new Vector();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 1000000; i++) {
            vector.add(i);
        }
        long t1 = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            linkedList.add((int) (Math.random()*1000000)/2,i);
        }
        long t2 = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            arrayList.add((int) (Math.random()*1000000)/2,i);
        }
        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            vector.add((int) (Math.random()*1000000)/2,i);
        }
        long t4 = System.currentTimeMillis();
        System.out.println("LinkedList花了"+(t2-t1)+"毫秒");
        System.out.println("ArrayList花了"+(t3-t2)+"毫秒");
        System.out.println("Vector花了"+(t4-t3)+"毫秒");
        System.out.println("一共花了"+(t4-t1)+"毫秒");


    }
}
