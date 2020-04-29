public class Task1 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if (number % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}
