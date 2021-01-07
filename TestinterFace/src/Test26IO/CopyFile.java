package Test26IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\QQ\\QQdownload\\3092989305\\FileRecv\\FileRecv.zip");
        File dir = new File("D:\\111");
//        System.out.println(f1.getName());
        long s = System.currentTimeMillis();
        method(f1,dir);
        long e = System.currentTimeMillis();
        System.out.println("一共花了"+(e-s)+"毫秒");
        File ss = new File(dir.getAbsolutePath()+"\\"+f1.getName());
        ss.delete();
    }
    public static void method(File f1,File f2) throws IOException {

        if (f1.isFile()&&f2.isDirectory()&&f2.exists()){
            String s = f2.getAbsolutePath()+"\\"+f1.getName();
            File file = new File(s);
//            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            FileInputStream fis = new FileInputStream(f1);

            byte[] a = new byte[1024];
            int len = 0;
            while ((len = fis.read(a)) !=-1){
                fos.write(a,0,len);
            }
            fos.close();
            fis.close();
        }else {
            System.out.println("文件路径错误或者文件不存在");
        }
    }
}