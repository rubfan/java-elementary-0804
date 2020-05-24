import java.util.Scanner;

public class HomeWork_9_2 {
    public static void main(String[] args) {
        System.out.println("Enter your text");
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine();
        String[] arr = t.split(" ");
        for (String s : arr)
            shortName(s);
    }

    public static void shortName(String s) {
        if (s.length() > 4) {
            int l = s.length() - 2;
            String num = Integer.toString(l);
            String first = String.valueOf(s.charAt(0));
            String last = String.valueOf(s.charAt(s.length() - 1));
            String[] arr = {first, num, last};
            for (String res : arr) {
                System.out.print(res);
            }
            System.out.print(" ");
        } else {
            System.out.print(s + " ");
        }
    }
}


