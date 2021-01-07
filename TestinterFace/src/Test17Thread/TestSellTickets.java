package Test17Thread;

public class TestSellTickets {
    public static void main(String[] args) {
        SellTickets sellTickets = new SellTickets();
        new Thread(sellTickets).start();
        new Thread(sellTickets).start();
        new Thread(sellTickets).start();
    }
}
