package bijiben;

import java.util.ArrayList;

public class LapTop {

    private ArrayList<USB> device = new ArrayList<>();
    public void PowerOn(){
        System.out.println("笔记本电脑开机!");
    }

    public void PowerOff(){
        System.out.println("笔记本电脑关机!");
        Remove_Device();
    }

    public void USB_Device(USB usb){
        Add_Device(usb);
        usb.open();
        usb.close();
    }
    private void Add_Device(USB usb){
        device.add(usb);
    }

    private void Remove_Device(int a){
        device.remove(a);
    }

    private void Remove_Device(){
        while (device.toArray().length!=0){
            device.remove(0);
        }
    }
    public void common(USB usb){
        if(usb instanceof KeyBorad){
            ((KeyBorad)usb).type();
        }
        if (usb instanceof Mouse){
            ((Mouse) usb).click();
        }
    }

    public void Show_Num_Of_USB(){
        System.out.println("外接USB数量"+device.toArray().length);
    }
}
