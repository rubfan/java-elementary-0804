public class Task_4_HW_4 {
//	"Find hypotenuse".
    	public static void main(String[] args) {
        	double firstСathet = Double.parseDouble(args[0]);
        	double secondСathet = Double.parseDouble(args[1]);
        	double hypotenuse = Math.sqrt(Math.pow(firstСathet, 2) + Math.pow(secondСathet, 2));
        	System.out.println("Value of hypotenuse is: " + hypotenuse);
    	}
}
