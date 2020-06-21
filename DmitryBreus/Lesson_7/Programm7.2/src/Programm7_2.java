import java.util.Scanner;

public class Programm7_2 {
    static String msg;
    static int modecon;
    public static void main(String[] args) {
        Laptop Lp = new Laptop();
        Smartphone Smrt = new Smartphone();
        System.out.println("Input message");
        Scanner in = new Scanner(System.in);
        msg = in.nextLine();
        System.out.println("Select Master device. 0 - Laptop of 1 - Smartphone");
        int dev = in.nextInt();
        System.out.println("Select mode connection for Laptop 0 - USB 1 - Bluetooth 2 - Ethernet");
        modecon = in.nextInt();
        System.out.println("Select mode connection for Smartphone for Laptop 0 - USB 1 - Bluetooth");
        int typecon = in.nextInt();
        switch (dev) {
            case 0: {
                if (modecon == typecon) Smrt.ReceiveMessage();
                else System.out.println("Device not found. Select mode connection");
            }
            break;
            case 1: {
                switch (modecon) {
                    case 0: {
                        if (modecon == typecon) Lp.ReceiveMessage();
                        else System.out.println("Device not found. Select mode connection");
                    }
                    break;
                    case 1: {
                        if (modecon == typecon) Lp.ReceiveMessage();
                        else System.out.println("Device not found. Select mode connection");
                    }
                    break;
                    case 2: {
                        System.out.println("Mode not used");
                    }
                    break;
                }//switch (modecon)
            }
            break;
        }//switch (dev )
    }
}
