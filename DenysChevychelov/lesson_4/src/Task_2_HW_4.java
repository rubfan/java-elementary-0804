public class Task_2_HW_4 {
//	"Maximum of numbers".
	public static void main(String[] args) {
		double firstNumber = Double.parseDouble(args[0]);
        	double secondNumber = Double.parseDouble(args[1]);
        	double thirdNumber = Double.parseDouble(args[2]);
        	double maxSecondThird = secondNumber >= thirdNumber ? secondNumber : thirdNumber;
        	double result = firstNumber >= secondNumber && firstNumber >= thirdNumber ? firstNumber : maxSecondThird;
        	System.out.println("Maximum number is: " + result);
 	}
}
