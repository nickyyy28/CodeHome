package Test6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("倪志玉傻逼");
        coll.add("123");
        coll.add("456");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String s;
            s=it.next();
            System.out.println(s);
        }
    }
}
