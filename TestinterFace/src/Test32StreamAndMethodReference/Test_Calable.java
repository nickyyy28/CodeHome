package Test32StreamAndMethodReference;

public class Test_Calable {
    public static void main(String[] args) {
        int i = 10;
        int i1 = test_Cal(i, Math::abs);
        System.out.println(i1);
    }
    public static int test_Cal(int number,Calable cal){
        return cal.calcu(number);
    }
}
