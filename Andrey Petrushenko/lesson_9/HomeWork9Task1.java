import java.util.Scanner;

public class HomeWork9Task1 {
    public static void main(String[] args) {
        System.out.println("Enter your e-mail address");
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();
        int d = inp.indexOf("@");
        int p = inp.indexOf(".");
        makeChanges(d, p, inp);
    }

    private static void makeChanges(int d, int p, String inp) {
        String user = inp.substring(0, d);
        String mail = inp.substring(d + 1, p);
        String c = inp.substring(p + 1);
        String change = "[at]";
        String change1 = "[dot]";
        String[] out = {user, change, mail, change1, c};
        for (String s : out) {
            System.out.print(s);
        }
    }
}


