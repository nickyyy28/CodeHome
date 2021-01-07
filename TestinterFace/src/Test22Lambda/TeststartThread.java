package Test22Lambda;

public class TeststartThread {
    public static void startThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread( () -> System.out.println("...") ); }
}
