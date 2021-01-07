package Test22Lambda;


public class Main {
    public static void main(String[] args) {
        int i = 10;
        TestCal tc = new TestCal(5,6, (a,b)-> a*b );
        tc.start();
    }
}
