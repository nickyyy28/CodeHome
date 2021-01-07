package source.Annotation;


public @interface MyAnnotation {
    /**
     * public interface MyAnnotation extends java.lang.annotation.Annotation {
     * }
     * 本质是一个继承了Annotation的接口
     */

    //可以定义返回值为基本数据类型+String的方法,不能返回空

    public abstract int show1();
    public abstract String show2();
    public abstract int show5() default 5;//使用default修饰时,需要初始化,在添加该注解时可不对该值初始化

    //返回值为枚举类型
    public abstract Person show3();

    //返回值为注解
    public abstract MyAnnotation2 show4();

    //或者以上的数组类型....
    public abstract String[] strs();
}
