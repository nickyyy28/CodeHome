/**
 * @AUTHOR : 张辉阳
 * @date :  2020/12/16 0:37
 * @version : 1.0
 */


package LeetCode;

public class Palindrome {
    public boolean isPalindrome(int x){

        String str1 = x + "";
        String str2 = new StringBuffer().append(str1).reverse().toString();

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        for (int i = 0 ; i < array1.length ; i++){
            if (array1[i] != array2[i]) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome(521));
    }
}
