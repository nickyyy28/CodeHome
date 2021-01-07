package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
/*
一副扑克
 */
public class Poker {
    ArrayList<Icard> poker = new ArrayList<>();

    public Poker() {
        setPoker();                     //向一副扑克中添加牌
        Collections.shuffle(poker);     //将牌打乱
    }

    private void setPoker(){
        String[] huase = {
                "红桃♥","黑桃♠","梅花♣","方块♦"
        };

        String[] number= {
                "3","4","5","6","7","8","9","10","J","Q","K","A","2"
        };

        for (int i = 0; i < huase.length; i++) {
            for (int j=0;j<number.length;j++){
                poker.add(new NormalCard(number[j],huase[i],j+1));
            }
        }
        poker.add(new SpecialCard("大王",15));
        poker.add(new SpecialCard("小王",14));
    }
//发牌
    public void Licensing(Person p1 , Person p2 , Person p3 , OtherCard o1) {
        for (int i = 0; i <poker.size() ; i++) {
            if (i%3==1 && i<51){
                p1.addCard(poker.get(i));
            }else if (i%3==2 && i<51){
                p2.addCard(poker.get(i));
            }else if (i%3==0 && i<51){
                p3.addCard(poker.get(i));
            }else {
                o1.addCard(poker.get(i));
            }
        }
    }
}
