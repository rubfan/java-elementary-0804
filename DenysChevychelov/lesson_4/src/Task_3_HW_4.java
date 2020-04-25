public class Task_3_HW_4 {
//	"Indicate in various number system"
    	public static void main(String[] args) {
		double numberDegree = Math.pow(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
	        String binaryResult = Integer.toBinaryString((int) numberDegree);
       		String octalResult = Integer.toOctalString((int) numberDegree);
        	String decimalResult = Integer.toString((int)numberDegree);
	        String hexResult = Integer.toHexString((int) numberDegree);
		String result = Integer.parseInt(args[2]) == 2 ? binaryResult : Integer.parseInt(args[2]) == 8 ? octalResult :
                Integer.parseInt(args[2]) == 10 ? decimalResult : Integer.parseInt(args[2]) == 16 ? hexResult : "TO INDICATE NUMBER SYSTEM, ENTER 2,8,10 or 16.";
		System.out.println(result);
	}
}
