package Test30Function;

import java.util.function.Function;

public class TestFunction3 {
    public static void main(String[] args) {
        String s = "赵丽颖,25";
        Person p1 = change(s, a -> {
            Person person = new Person();
            person.setAge(Integer.parseInt(a.split(",")[1]));
            person.setName(a.split(",")[0]);
            return person;
        });
        System.out.println(p1);
    }

    public static Person change(String s, Function<String, Person> fun){
        return fun.apply(s);
    }
}
