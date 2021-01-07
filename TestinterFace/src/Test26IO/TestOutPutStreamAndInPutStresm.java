package Test26IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestOutPutStreamAndInPutStresm {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("D:\\111\\aaa.txt",false);
//        String s = sc.nextLine();
//        f1.write(s.getBytes());
//        for (int i = 0; i <10 ; i++) {
//            f1.write("\r\n".getBytes());
//            f1.write("你好".getBytes());
//
//        }
        String s = "azvz";
        fos.write(s.getBytes());
        fos.close();
        int k;
        FileInputStream fis = new FileInputStream("D:\\111\\aaa.txt");
        while ((k=fis.read())!=-1){
            System.out.println((char) k);
        }
        fis.close();
    }
}
