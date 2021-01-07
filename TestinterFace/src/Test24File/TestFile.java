package Test24File;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
//        System.out.println(File.pathSeparator);//";"
//        System.out.println(File.separator);//"\"
        File file = new File("aaa.txt");
        File file1 = new File("D:\\a\\a.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.length());
        File file2 = new File("D:\\images");
        System.out.println(file2.length());
    }
}
