package test01;

public class Main {
    public static void main(String[] args) {
        Out out = new Out();
        out.Name();
        Out.In in = new Out().new In();
        in.print();
    }
}
