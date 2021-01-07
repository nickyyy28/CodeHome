package Test32StreamAndMethodReference;

public class TestPrintString {
    public static void main(String[] args) {
        String s = "Hello";

        //用lambda表达式输出字符串
        run(s, a -> System.out.println(a.toUpperCase()));

        //用方法引用输出字符串
        OBJ obj = new OBJ();
        run(s,obj::printUPerString);
    }

    public static void run(String s , PrintString ps){
        ps.print(s);
    }
}
class OBJ{
    public OBJ() {
    }

    public void printUPerString(String s){
        System.out.println(s.toUpperCase());
    }
}