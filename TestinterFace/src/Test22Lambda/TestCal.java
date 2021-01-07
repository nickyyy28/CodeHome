package Test22Lambda;

public class TestCal {
    Cal cal;
    int a;
    int b;
    public TestCal(int a,int b, Cal cal) {
        this.cal=cal;
        this.a=a;
        this.b=b;
    }

    public void start(){
        System.out.println(cal.run(a,b));
    }
}
