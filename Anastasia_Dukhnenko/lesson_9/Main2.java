import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Your text: ");
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String[] arr = t.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(change(arr[i]) + " ");
        }
    }
    public static String change(String s) {
        if (s.length() < 4) {
            return s;
        } else {
            return s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1);
        }
    }
}
