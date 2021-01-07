package Test24File;

import java.io.File;

public class TestFile2 {
    public static void main(String[] args) {
        File file1 = new File("D:\\images");
        File file2 = new File("D:\\images\\1.jpg");
        File file3 = new File("aaa.txt");

        System.out.println(file1.exists());
        System.out.println(file2.exists());
        System.out.println(file3.exists());

        System.out.println(file1.isDirectory());
        System.out.println(file2.isDirectory());
        System.out.println(file3.isDirectory());
    }
}
