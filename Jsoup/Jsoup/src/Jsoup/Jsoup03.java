package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Jsoup03 {
    public static void main(String[] args) throws IOException {
        String path = Jsoup.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");

        
    }
}
