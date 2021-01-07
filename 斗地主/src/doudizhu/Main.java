package doudizhu;

public class Main {
    public static void main(String[] args) {
        Poker first = new Poker();
        Person p1 = new Person("小华");
        Person p2 = new Person("小明");
        Person p3 = new Person("小红");
        OtherCard o = new OtherCard();
        first.Licensing(p1,p2,p3,o);
        p1.sort();
        p2.sort();
        p3.sort();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(o.toString());
        int[] a = new int[5];
        for (int i = 0; i <5 ; i++) {
            a[i]=i;
        }
        try {
            a[5]=1;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("出错了");
        }
    }
}
