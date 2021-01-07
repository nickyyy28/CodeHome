package source.Annotation;

@SuppressWarnings("all") //忽略所有warning
public class ThreeAnnotation {

    @Override     //表示重写方法
    public String toString() {
        return super.toString();
    }

    @Deprecated   //表示已过时
    public void show1(){
        System.out.println("show1......");
    }

    @MyAnnotation(show1 = 1,show2 = "张三" /*,show5 = 45 */,show3 = Person.P1,show4 = @MyAnnotation2,strs = {"aaa","vvv"})
    public static void all(){

    }
}
