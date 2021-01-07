package Test32StreamAndMethodReference;

import java.util.function.Function;

public class TestPerson {
    public static void main(String[] args) {
        String s = "古力娜扎";
        people(s,Person::new);
    }

    public static Person people(String s , Function<String,Person> fun){
        return fun.apply(s);
    }
}
