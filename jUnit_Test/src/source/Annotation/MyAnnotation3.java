package source.Annotation;

import javax.lang.model.element.Element;
import java.lang.annotation.*;

/**
 * 元注解,用于描述注解的注解
 * 1.@Target      描述注解能够作用的位置
 *      三个值:TYPE,METHOD,FIELD.分别是类,方法,成员变量
 * 2.@Retention   描述注解能够被作用的阶段
 * 3.@Documented  描述注解能否被抽取到api文档中
 * 4.@Inherited   描述注解是否被子类继承
 *
 */
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation3 {

}
