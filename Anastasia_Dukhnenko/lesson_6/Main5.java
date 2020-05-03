import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 4, 7, 8, 3, 2, 11};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
