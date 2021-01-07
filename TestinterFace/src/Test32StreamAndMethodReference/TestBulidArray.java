package Test32StreamAndMethodReference;

public class TestBulidArray {
    public static void main(String[] args) {
        int[] arr = bulid(5,int[]::new);
    }

    public static int[] bulid(int len, BulidArray ba){
        return ba.bulidint(len);
    }
}
