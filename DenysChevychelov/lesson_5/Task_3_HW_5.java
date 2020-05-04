public class closestToTen {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        boolean firstCase = firstNumber <= 10 && secondNumber <= firstNumber;
        boolean secondCase = firstNumber >= 10 && secondNumber >= firstNumber;

        if (firstCase | secondCase) {
            System.out.println(firstNumber + " closest to 10");
        } else {
            System.out.println(secondNumber + " closest to 10");
        }
    }
}
