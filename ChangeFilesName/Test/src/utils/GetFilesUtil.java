package utils;

import java.io.File;
import java.util.HashMap;

public class GetFilesUtil {

    //获取所有文件为.png结尾的文件路径,和父文件夹的前4个编号作为键值对存储到map集合中
    public static void GetFileNames(String rootPath , HashMap<String,String> map){

        for (String s : new File(rootPath).list()){
            String filePath = rootPath+"\\"+s;
            if (new File(filePath).isFile() && s.endsWith(".png")){
                map.put(filePath , new File(rootPath).getName().substring(0,4));
            } else if (new File(filePath).isDirectory()){
                GetFileNames(filePath , map);
            }
        }
    }
}
