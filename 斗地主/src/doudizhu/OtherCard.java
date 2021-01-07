package doudizhu;

import java.util.ArrayList;
/*
底牌堆
 */
public class OtherCard {
    ArrayList<Card> otherCard = new ArrayList<>();
    public void addCard(Card card){
        otherCard.add(card);
    }

    @Override
    public String toString() {
        return "三张底牌{" +
                "otherCard=" + otherCard +
                '}';
    }
}
