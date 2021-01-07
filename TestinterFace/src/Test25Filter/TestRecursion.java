package Test25Filter;

import java.io.File;

public class TestRecursion {
    static int cnt=0;
    public static void main(String[] args) {
        File file = new File("D:\\111");
        System.out.println(file.exists());
        findFile(file);

    }
    public static void findFile(File file){
        for (File f : file.listFiles()){
            if (f.isDirectory()){
                findFile(f);
            }else {
                if (f.getName().endsWith(".txt")){
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }

    //递归遍历所有文件
    private static void method5(File file) {

        for (File file1: file.listFiles()){
            if (file1.isDirectory()){
                if (file1.listFiles().length!=0){
                    System.out.println(file1.getAbsolutePath());
                }else {
                    System.out.println(file1.getAbsolutePath());
                }
            }else {
                System.out.println(file1.getAbsolutePath());
            }
            if (file1.isDirectory()){
                method5(file1);
            }
        }
    }

    private static int method4(int i) {             //递归计算阶乘
        if(i==1){
            return 1;
        }
        return i*method4(i-1);
    }

    private static int method3(int i) {             //递归计算n+(n-1)+(n-2)+...+2+1
         int a=0;
         a=i;
         if (i==0){
             return 0;
         }
         i--;
         return a+method3(i);
    }

    private static void method2(int i) {

        if (i==20000){
            return;
        }
        System.out.println(i++);
        method2(i);
    }


    private static void method1(int a) {
        if (a>0){
            System.out.println(a);
            a--;
            method1(a);
        }
    }
}
