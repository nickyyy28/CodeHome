package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetMiMe {
    static Properties properties = new Properties();
    static {
        try {
            properties.load(GetMiMe.class.getClassLoader().getResourceAsStream("mime.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getMiMe(String name){
        String[] strings = name.split("\\.");
        if (strings.length != 2){
            return null;
        } else {
            return properties.getProperty(strings[1]);
        }

    }

//    public static void main(String[] args) {
//        String str = "aaa.jpg";
//
//        System.out.println(GetMiMe.getMiMe(str));
//    }
}
