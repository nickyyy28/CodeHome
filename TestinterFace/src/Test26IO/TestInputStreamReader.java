package Test26IO;

import java.io.*;

public class TestInputStreamReader {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("d:\\ANSI.txt"));
//        char[] chars = new char[1024];
//        int len=0;
//        while ((len=br.read(chars)) != -1){
//            System.out.println(new String(chars,0,len));
//        }
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream(
                        new File("d:\\ANSI.txt")
                ),"UTF-16LE"
        );
        char[] chars = new char[1024];
        int len=0;
        while ((len=isr.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        isr.close();
    }
}
