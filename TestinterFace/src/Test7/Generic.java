package Test7;

public class Generic<E> {
    private E name;
    public void setName(E e){
        this.name=e;
    }

    public E getName(){
        return name;
    }

    public <M> String Damo01(M m){
        return m.toString();
    }
}
