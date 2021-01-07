package Test26IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedOutPutStream {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("123.txt"),1024);
        bos.write("你干啥?".getBytes());
        bos.close();
    }
}
