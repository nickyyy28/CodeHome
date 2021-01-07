package Test26IO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestWriter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("aa.txt");
        fw.write(sc.nextLine());
        fw.flush();
        fw.close();
    }
}
