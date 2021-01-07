package Test13CreateException;

import java.io.FileNotFoundException;

public class TestException {
    public static void main(String[] args) {
        String s = "a.txt";
        try {
            method1(s,0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MyException e){
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }
    }

    private static void method1(String s,int i) throws FileNotFoundException ,MyException {
        if( s.equals("1a.txt")){
            throw new FileNotFoundException("文件打开错误");
        }
        if (i==0){
            throw new MyException("dadadda");
        }
        System.out.println("文件打开成功");
    }

}
