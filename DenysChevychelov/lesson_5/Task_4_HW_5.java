public class minNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);
        boolean firstCheck = firstNumber <= secondNumber && firstNumber <= thirdNumber;
        boolean secondCheck = secondNumber <= firstNumber && secondNumber <= thirdNumber;
        boolean thirdCheck = thirdNumber <= secondNumber && thirdNumber <= firstNumber;
        if (firstCheck) {
            System.out.println(firstNumber);
        }
        if (secondCheck) {
            System.out.println(secondNumber);
        }
        if (thirdCheck) {
            System.out.println(thirdNumber);
        }
    }
}
