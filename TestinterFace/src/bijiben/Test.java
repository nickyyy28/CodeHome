package bijiben;

public class Test {

    public static boolean isTrue(boolean a , boolean b){
        return !((a && b)||(!a && !b));
    }

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        System.out.println(isTrue(a,b));
    }
}
