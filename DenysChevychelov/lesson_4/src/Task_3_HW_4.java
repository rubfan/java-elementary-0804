public class Task_3_HW_4 {
//	"Indicate in various number system"
    	public static void main(String[] args) {
		int numberDegree = (int)Math.pow(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        	String result = Integer.toString(numberDegree, Integer.parseInt(args[2]));
        	System.out.println(result);
	}
}
