public class Laptop {
    public static int[] modeconnect = new int[]{0, 1, 2};
    public static void ReceiveMessage() {
        Programm7_2 Prg7_2 = new Programm7_2();
        System.out.println("Receive device: Laptop");
        System.out.println("Mode: " + modeconnect[Prg7_2.modecon] + ". Text: " + Prg7_2.msg);
    }

}
