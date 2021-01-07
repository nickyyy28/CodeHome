package Test24File;

import java.io.File;

public class TestFileList {
    public static void main(String[] args) {
        method2();
    }

    private static void method2() {
        File file = new File("D:\\111");
        for (File f : file.listFiles()){
            System.out.println(f.getAbsolutePath());
        }
    }

    private static void method1() {
        File file = new File("D:\\111");
        System.out.println(file.exists());
        for (String s : file.list()){
            System.out.println(s);
        }
    }
}
