package Test26IO;

import java.io.*;
import java.util.Scanner;

public class TestOutPutStreamWriter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("d:\\写其他格式文件.txt",true),"GBK"
        );
        osw.write(sc.nextLine());
        osw.close();
//        BufferedOutputStream bos = new BufferedOutputStream(osw);//错误
//        BufferedWriter bw = new BufferedWriter(osw);//可以
    }
}
