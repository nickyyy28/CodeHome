package Test14Thread;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        for (int i = 0; i <200 ; i++) {
            System.out.println(name+"-->"+i);
        }
    }
}
