package LeetCode;

import java.util.ArrayList;

public class length_OfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int thislength = 0;
        char[] chars = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0 ; i<chars.length ; i++){
            if (!isExist(list,chars[i])){
                list.add(chars[i]);
                thislength = list.size();
                if (thislength > length){
                    length = thislength;
                }
            } else {
              list.remove(chars[i]);
              list.add(chars[i]);
            }
        }
        return length;
    }

    public static boolean isExist(ArrayList<Character> a , Character c){
        return a.contains(c);
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        length_OfLongestSubstring length_ofLongestSubstring = new length_OfLongestSubstring();
        int i = length_ofLongestSubstring.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
