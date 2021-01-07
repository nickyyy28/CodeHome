package MyObject;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (age != person.age) {
            return false;
        }
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
