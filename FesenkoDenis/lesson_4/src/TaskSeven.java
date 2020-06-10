public class TaskSeven {
	
	public static void main(String[] params) {
		double quantityP = Integer.parseInt(params[0]);
		double quantityB = Math.ceil((quantityP * 100)/750);
        int rest = (int) (quantityB * 750 - quantityP * 100);
        System.out.printf("A quantity of bottles is: %.0f and the rest of champagne is: %dml.", quantityB, rest);
	}
}