package Test26IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ArrayList<Person> list = new ArrayList<>();
//        BufferedOutputStream bos = new BufferedOutputStream(
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("person")
        );
//        );
        list.add(new Person("迪丽热巴",18));
        list.add(new Person("古力娜扎",20));
        list.add(new Person("马儿扎哈",25));
        oos.writeObject(list);
        oos.close();
    }
}
