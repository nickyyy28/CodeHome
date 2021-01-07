package doudizhu;
/*
定义普通的牌
 */
public class NormalCard extends Icard  {
    private String Number;
    private String Huase;

    public NormalCard( String number, String huase,int idNumber) {
        super(idNumber);
        Number = number;
        Huase = huase;
    }

    public String getNumber() {
        return Number;
    }

    public String getHuase() {
        return Huase;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return Huase+Number;
    }

}
