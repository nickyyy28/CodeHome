package Test30Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class TestPredicate2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};
        for (String s : arr){
            if (is_meet_the_requirements(s,(a) -> a.split(",")[0].length()==4 ,
                    (a) -> a.split(",")[1].equals("女"))){
                list.add(s);
            }
        }
        System.out.println("筛选前:"+Arrays.toString(arr));
        System.out.println("筛选后:"+list);
    }

    public static boolean is_meet_the_requirements(String s, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.and(pre2).test(s);
    }
}
