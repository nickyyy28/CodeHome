package source.CheckCalculate;

public class Calculator {

    @Check
    public void add(){
        int i = 1 + 0;
        System.out.println(i);
    }

    @Check
    public void sub(){
        int i = 1 - 0;
        System.out.println(i);
    }

    @Check
    public void mlt(){
        int i = 1 * 0;
        System.out.println(i);
    }

    @Override
    public String toString() {
        return "Calculator{}";
    }

    @Check
    public void div(){
        int i = 1 / 0;
        System.out.println(i);
    }

    @Check
    public void ppp(){
        int[] arr = new int[5];
        System.out.println(arr[5]);
    }

    public void donothing(){
        System.out.println("nothing.....");
    }
}
