public class TaskFive {

    public static void main(String[] params) {
		double firstScore = Double.parseDouble(params[0]);
		String firstName = params[1];
        double secondScore = Double.parseDouble(params[2]);
		String secondName = params[3];
        double score = Math.abs((secondScore-firstScore)/(firstScore)*100);
        System.out.printf("The difference between %s and %s is %.2f%%", firstName, secondName, score);
    }
}
