package Test25Filter;

import java.io.File;

public class TestFilter {
    public static void main(String[] args) {
        File file = new File("D:\\111");
        FindAllFiles(file);
    }

    public static void FindAllFiles(File file){
        for (File file1 : file.listFiles()){
            if (file1.isDirectory()){
                FindAllFiles(file1);
            }else {
                for (File f : file1.listFiles(new MyFilter())){
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
