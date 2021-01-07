package utils;

import java.io.*;

public class ChangeFileNameUtil {
    //改变文件名
    public static void changeFileName(String filepath , String code) throws IOException {
        File oldFile = new File(filepath);
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(oldFile)
        );

        byte[] bytes = new byte[1024];
        int len = 0;

        String oldFileAbsolutePath = oldFile.getAbsolutePath();
        String name = oldFile.getName();

        String substring = oldFileAbsolutePath.substring(0, oldFileAbsolutePath.length() - name.length());

        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(
                        new File(substring + code + name)
                )
        );

        while ((len = bis.read(bytes)) != -1 ){
            bos.write(bytes , 0 , len);
        }

        bos.close();
        bis.close();

        oldFile.delete();
    }
}
