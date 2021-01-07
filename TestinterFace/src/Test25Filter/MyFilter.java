package Test25Filter;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.getName().endsWith(".txt")&&pathname.isFile()){
            return true;
        }
        return false;
    }
}
