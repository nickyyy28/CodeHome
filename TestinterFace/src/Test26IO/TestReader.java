package Test26IO;

import java.io.FileReader;
import java.io.IOException;

public class TestReader {
    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("aa.txt");
        FileReader fr2= new FileReader("D:\\QQ\\QQdownload\\3092989305\\FileRecv\\白茴6.txt");
//        int len = 0;
//        while ((len = fr1.read()) != -1){
//            System.out.print((char) len);
//        }
        int len2 = 0;
        char[] a = new char[100];
        while ((len2 = fr2.read(a)) != -1){
            System.out.print(new String(a,0,len2));
        }

    }
}
