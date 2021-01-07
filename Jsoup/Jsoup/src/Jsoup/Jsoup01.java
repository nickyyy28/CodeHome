package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;

/**
 * Jsoup快速入门
 */

public class Jsoup01 {
    public static void main(String[] args) throws IOException {
        //1.获取document对象
        URL resource = Jsoup.class.getClassLoader().getResource("student.xml");
        String path = resource.getPath();
//        Document document = Jsoup.parse(new File(path), "utf-8");
//
//        //获取Element
//        Elements people = document.getElementsByTag("name");
//
//        System.out.println(people.size());
//        for (Element e : people){
//            System.out.println(e);
//        }

        //通过网络url获取资源
        URL url = new URL("https://www.baidu.com");
        Document document = Jsoup.parse(url, 10000);

        PrintStream ps = new PrintStream( new File("D://html.html") );

        System.setOut(ps);

        System.out.println(document);

        ps.close();
    }
}
