import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] arr = text.split(", ");
        String result = "";
        int count = 0;
        for (int x = 0; x < arr.length; x++) {
            String t = arr[x];
            for (int i = 0; i < t.length(); i++) {
                 result = new StringBuffer(t).reverse().toString();
            }
            if (t.matches(result)) {
                count++;
            }
        }
        System.out.println("There are " + count + " palindromes in the text");
    }
}
