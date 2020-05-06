public class Task_5_HW_4 {
//	"Score difference"
    	public static void main(String[] args) {
        	int firstCommandScore = Integer.parseInt(args[0]);
        	int secondCommandScore = Integer.parseInt(args[1]);
        	double firstCommandDiff = firstCommandScore * 100 / secondCommandScore - 100;
        	double secondCommandDiff = secondCommandScore * 100 / firstCommandScore - 100;
        	String printDifference = firstCommandScore >= secondCommandScore ? args[2] + " wins on: " + firstCommandDiff + "%" :
                args[3] + " wins on: " + secondCommandDiff + "%";
        	System.out.println(printDifference);
    	}
}
