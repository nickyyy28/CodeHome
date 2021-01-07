package bijiben;

public class Main {
    public static void main(String[] args) {
        LapTop lapTop = new LapTop();
        lapTop.PowerOn();
        lapTop.Show_Num_Of_USB();
        lapTop.USB_Device(new Mouse());
        lapTop.USB_Device(new KeyBorad());
        lapTop.USB_Device(new Display());
        lapTop.Show_Num_Of_USB();
        lapTop.PowerOff();
        lapTop.Show_Num_Of_USB();
    }
}
