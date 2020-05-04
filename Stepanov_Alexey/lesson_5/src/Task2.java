public class Task2 {
    public static void main(String[] args) {
        int numb1 = Integer.parseInt(args[0]);
        int numb2 = Integer.parseInt(args[1]);
        if (numb1 % numb2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
