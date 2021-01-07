package bijiben;

public class Display implements USB {
    @Override
    public void open() {
        System.out.println("显示器打开");
    }

    @Override
    public void close() {
        System.out.println("显示器关闭");
    }
}
