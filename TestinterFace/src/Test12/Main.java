package Test12;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(char c : s.toCharArray()){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);

    }
}
