package utils;

import java.util.Random;

public class RandomStringUtil {
    public static String getRandomString(String str){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i = 0 ; i<4 ; i++){
            sb.append(chars[random.nextInt(chars.length)]);
        }

        return sb.toString();
    }
}
