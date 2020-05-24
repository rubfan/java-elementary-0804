public class Smartphone {
    public static String[] modeconnect=new String[]{"USB","Bluetooth"};
    public static void ReceiveMessage()
    {
        Programm7_2 Prg7_2= new Programm7_2();
        System.out.println("Receive device: Smartphone");
        System.out.println("Mode: "+modeconnect[Prg7_2.modecon]+". Text: "+ Prg7_2.msg  );

    }

}
