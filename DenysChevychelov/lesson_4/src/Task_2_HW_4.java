public class Task_2_HW_4 {
//	"Maximum of numbers".
	public static void main(String[] args) {
		double firstDoubleNumber = Double.parseDouble(args[0]);
	        double secondDoubleNumber = Double.parseDouble(args[1]);
	        double thirdDoubleNumber = Double.parseDouble(args[2]);
        	double result = firstDoubleNumber >= secondDoubleNumber && firstDoubleNumber >= thirdDoubleNumber ? 
		firstDoubleNumber : secondDoubleNumber >= thirdDoubleNumber ? secondDoubleNumber : thirdDoubleNumber;
        	System.out.println("Maximum number is: " + result);
 	}
}
