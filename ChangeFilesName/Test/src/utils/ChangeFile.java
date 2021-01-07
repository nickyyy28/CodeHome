package utils;

import java.io.IOException;
import java.util.HashMap;

public class ChangeFile {

    //传入根文件夹的路径
    public static void ChangFileName(String rootPath) throws IOException {
        HashMap<String,String> map = new HashMap<>();

        GetFilesUtil.GetFileNames(rootPath,map);

        for (String s : map.keySet()){
            ChangeFileNameUtil.changeFileName(s,map.get(s));
        }
    }
}
