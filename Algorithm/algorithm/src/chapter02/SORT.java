package chapter02;


import org.junit.Test;

import java.util.Random;

public class SORT {


    @Test
    public void insert_sort(){
        int[] a = new int[1000];
        Random rm = new Random();
        for (int i = 0 ; i<a.length ; i++){
            a[i] = rm.nextInt(a.length);
        }
        int key;
        int j;

        long s = System.currentTimeMillis();
        for (int i = 2 ; i<a.length ; i++){
            key = a[i];
            j = i - 1;
            while (j>0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        long e = System.currentTimeMillis();
        System.out.println("===========================");
        int cnt = 0;
        for (int i : a){
            System.out.println(i+":"+cnt);
            cnt++;
        }
        System.out.println("共花费:"+(e-s)+"毫秒");
    }
}
