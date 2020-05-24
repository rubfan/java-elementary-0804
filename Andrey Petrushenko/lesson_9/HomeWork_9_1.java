import java.util.Scanner;

public class HomeWork_9_1 {
    public static void main(String[] args) {
        System.out.println("Enter your e-mail address");
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();
        int d = inp.indexOf("@");
        int p = inp.indexOf(".");
        String change = "[at]";
        String change1 = "[dot]";
        String user = inp.substring(0, d);
        String mail = inp.substring(d + 1, p);
        String c = inp.substring(p + 1);
        String[] out = {user, change, mail, change1, c};
        for (String s : out) {
            System.out.print(s);
        }
    }
}


