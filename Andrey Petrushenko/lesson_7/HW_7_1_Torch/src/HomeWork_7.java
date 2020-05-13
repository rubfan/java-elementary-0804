import java.util.Scanner;

public class HomeWork_7 {

    public static void main(String[] args) {
        Torch t = new Torch();
        t.nameOfTorch = "Thomas";
        System.out.println("Insert batterys 1-3");
        Scanner scan = new Scanner(System.in);
        int battery = scan.nextInt();
        switch (battery) {
            case 1:
                t.Whitelight();
                break;
            case 2:
                t.Redlight();
                break;
            case 3:
                t.Flashlight();
                break;
            default:
                System.out.println("You can insert no more three batterys");
        }
    }
}
