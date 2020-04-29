public class divisionRemainder {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        if (firstNumber % secondNumber == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

