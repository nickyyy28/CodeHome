package Test26IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class TestObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("person")
        );
        ArrayList<Person> people = new ArrayList<>();
        Object obj;
        obj=ois.readObject();
//        while ((obj = ois.readObject()) instanceof Person){
//            people.add((Person)obj);
//        }
        System.out.println(obj);
//        System.out.println(people);
        ois.close();
    }
}
