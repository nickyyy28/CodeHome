package Test26IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.put("123","666");
        properties.setProperty("123","777");
        properties.setProperty("456","888");
        String property = properties.getProperty("123");
//        System.out.println(property);
//        System.out.println(properties);
        Iterator<String> iterator = properties.stringPropertyNames().iterator();
        while (iterator.hasNext()){
            System.out.println(properties.getProperty(iterator.next()));
        }
        FileWriter fw = new FileWriter("aa.txt");
        properties.store(fw,"keyi");
        fw.close();

        Properties p2 = new Properties();
        p2.load(new FileReader("aa.txt"));
        System.out.println(p2);
    }
}
