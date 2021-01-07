package Test3;

public class Fu {
    private int age;
    private String name;
    private int height;
    private int weight;

    public Fu(int age, String name, int height, int weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fu fu = (Fu) o;

        if (age != fu.age) return false;
        if (height != fu.height) return false;
        if (weight != fu.weight) return false;
        return name != null ? name.equals(fu.name) : fu.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + height;
        result = 31 * result + weight;
        return result;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
