package LeetCode;

import MyObject.Person;

import java.util.ArrayList;

public class MyList {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person());
        people.add(1,new Person());
        people.get(0);
        people.remove(0);
        people.indexOf(new Person());
        people.size();
    }
}
