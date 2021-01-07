package LeetCode;

public class Find_Longest_Arrays_Number {

    public static void main(String[] args) {
        int[] a = {4,-3,5,-2,-1,2,6,-2};
        System.out.println(findNum(a));
        System.out.println(maxSubseqSum(a));
    }

    public static int maxSubseqSum(int[] a){
        int thisSum = 0 , maxSum = 0;
        for (int i =0; i<a.length ; i++){
            thisSum += a[i];
            if (thisSum > maxSum){
                maxSum = thisSum;
            } else if(thisSum < 0){
                thisSum = 0;
            }
        }
        return maxSum;
    }

    public static int findNum(int[] a){
        int numLeft = 0;
        int numRight = 0;
        int numCenter = 0;
        if (a.length > 1){
            int[] a1 = new int[(a.length)/2];
            int[] a2 = new int[a.length - a1.length];
            for ( int i = 0; i< a1.length ; i++){
                a1[i] = a[i];
            }
            for ( int i = 0; i< a2.length ; i++){
                a2[i] = a[i + a1.length];
            }
            numLeft = findNum(a1);
            numRight = findNum(a2);
            numCenter = findLeftMax(a1) + findRightMax(a2);
            return findMax(numLeft,numRight,numCenter);
        } else {
            if (a[0] >= 0){
                return a[0];
            } else {
                return 0;
            }
        }

    }

    public static int findMax(int num1 , int num2 , int num3){
        int max = num1;
        if (max < num2){
            max = num2;
        }
        if (max < num3){
            max = num3;
        }
        return max;
    }

    public static int findLeftMax(int[] a){
        int max = 0;
        int cnt = 0;
        for (int i = a.length-1 ; i>=0 ; i--){
            cnt += a[i];
            if (cnt>max){
                max = cnt;
            }
        }
        return max;
    }

    public static int findRightMax(int[] a){
        int max = 0;
        int cnt = 0;
        for (int i = 0 ; i<a.length ; i++){
            cnt += a[i];
            if (cnt>max){
                max = cnt;
            }
        }
        return max;
    }
}
