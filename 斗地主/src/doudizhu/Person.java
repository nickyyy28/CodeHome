package doudizhu;

import java.util.ArrayList;
import java.util.Collections;

/*
定义玩家类
 */
public class Person {
    private ArrayList<Icard> selfCard = new ArrayList<>();
    public final String name;
    public Person(String name) {
        this.name=name;
    }

    public void addCard(Icard card){
        selfCard.add(card);
    }

    @Override
    public String toString() {
        return "Person{" +
                "selfCard=" + selfCard +
                ", name='" + name + '\'' +
                '}';
    }

    public void sort(){
        Collections.sort(selfCard);
    }
}
