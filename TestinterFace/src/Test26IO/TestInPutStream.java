package Test26IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestInPutStream {
    public static void main(String[] args) throws IOException {
        byte[] a = new byte[3];
        FileInputStream fis = new FileInputStream("aa.txt");
        System.out.println(Arrays.toString(a));
        fis.read(a);
        System.out.println(Arrays.toString(a));
        System.out.println(new String(a));
        fis.close();
    }
}
