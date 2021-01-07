package Test8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class Generic<E> {
    private ArrayList<E> list = new ArrayList<>();
    public static void printarray(ArrayList<?> list){
        Iterator<?> it =list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        for (Object o :list.toArray()) {
            System.out.println(o);
        }
    }
    public  static  void method(HashMap<String,Integer> hashMap){
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()){
            System.out.println(hashMap.get(it.next()));
        }


    }

    public void add(E e){
        list.add(e);
    }
}
