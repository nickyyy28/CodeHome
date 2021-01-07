package Test24File;

import java.io.File;
import java.io.IOException;

public class TestFileCreateAndDelete {
    public static void main(String[] args) throws IOException {
        method3();

    }
    //删除文件/文件夹
    private static void method4() {
        File file = new File("D:\\111\\222\\333");
        System.out.println(file.delete());

    }

    //创建多级文件夹
    private static void method3() {
        File file = new File("D:\\1\\5\\3\\4");
        if (file.exists()){
            System.out.println("文件夹已存在!");
        }else{
            file.mkdirs();
            System.out.println("文件夹创建成功!");
        }
    }
    //创建单级文件夹
    private static void method2() {
        File file = new File("D:\\images\\aaa");
        if (file.exists()){
            System.out.println("文件夹已存在!");
        }else {
            file.mkdir();
            System.out.println("文件夹创建成功!");
        }
    }
    //创建文件
    private static void method1() throws IOException {
        File file1 = new File("D:\\images\\aaa");
        File file2 = new File("D:\\images\\aaa\\1.png");
        if ( file2.exists()){
            System.out.println("文件夹已存在!");
        }else {
            file2.createNewFile();
            System.out.println("文件创建成功");
        }
    }


}
