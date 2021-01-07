package doudizhu;

public class Icard implements Comparable<Icard> ,Card{
    public final int idNumber;

    public Icard(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }



    @Override
    public int compareTo(Icard o) {
        return this.idNumber-o.idNumber;
    }
}
