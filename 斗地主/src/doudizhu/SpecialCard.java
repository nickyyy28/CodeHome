package doudizhu;
/*
大王/小王
 */
public class SpecialCard extends Icard  {
    private String name;


    public int getIdNumber() {
        return idNumber;
    }

    public SpecialCard( String name,int idNumber) {
        super(idNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }




}
