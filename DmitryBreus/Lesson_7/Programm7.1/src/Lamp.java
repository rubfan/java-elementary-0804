import java.util.Scanner;
public class Lamp {
    public static NameDevice Name =new NameDevice();
    public static BatteryCase battery = new BatteryCase();
    public LedColor color=new LedColor();
    public static Mode mode=new Mode();

    public static void main(String[] args) {
        Lamp lamp=new Lamp();
        System.out.println("Input name Lamp");
        Scanner in = new Scanner(System.in);
        NameDevice.nameDevice = in.nextLine();
        System.out.println("Input quantity of battery");
        battery.batteryQlty = in.nextInt();
        System.out.println("Input number of mode for Lamp");
        mode.SelectMode=in.nextInt();
        mode.Selected();


    }
}
