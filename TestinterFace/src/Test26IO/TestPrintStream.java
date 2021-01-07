package Test26IO;

import java.io.*;
import java.util.Scanner;

public class TestPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
//        BufferedOutputStream bos = new BufferedOutputStream(
//                new PrintStream(
//                        new FileOutputStream(new File("d:\\111\\测试.txt"))
//                )
//        );
        PrintStream printStream = new PrintStream(new FileOutputStream(new File("d:\\111\\测试.txt"),true));
        printStream.println(sc.nextLine());
        System.setOut(printStream);
        System.out.println("11:39");
        printStream.close();
    }
}