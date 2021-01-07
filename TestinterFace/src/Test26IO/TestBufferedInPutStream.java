package Test26IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInPutStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("aaa.txt"),1024);
        int len=0;
        while ((len=bis.read()) != -1){
            System.out.print((char) len);
        }
        bis.close();
    }
}
