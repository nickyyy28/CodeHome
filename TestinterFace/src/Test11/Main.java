package Test11;

public class Main {

    public static void print(int... s){
        int cnt=0;
        for (int i: s) {
            cnt+=i;
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Main.print(1,2,3,4);
    }
}


