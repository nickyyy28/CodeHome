package Test26IO;

import java.io.*;

public class BufferedCopyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\QQ\\QQdownload\\3092989305\\FileRecv\\FileRecv.zip");
        File dir = new File("D:\\111");
        long s = System.currentTimeMillis();
        method(file,dir);
        long e = System.currentTimeMillis();
        System.out.println("一共花了"+(e-s)+"毫秒");
        File ss = new File(dir.getAbsolutePath()+"\\"+file.getName());
        ss.delete();
    }

    public static void method(File file,File dir) throws IOException {
        if (file.isFile()&&dir.isDirectory()&&dir.exists()){
            String s = dir.getAbsolutePath()+"\\"+file.getName();
            File newfile = new File(s);

            FileOutputStream fos = new FileOutputStream(newfile);
            FileInputStream fis = new FileInputStream(file);

            BufferedOutputStream bos = new BufferedOutputStream(fos);
            BufferedInputStream bis = new BufferedInputStream(fis);

            byte[] a = new byte[1024];
            int len = 0;
            while ((len = bis.read(a)) !=-1){
                bos.write(a,0,len);
            }
            bos.close();
            bis.close();
        }else {
            System.out.println("文件路径错误或者文件不存在");
        }
    }
}
