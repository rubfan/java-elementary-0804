public class TaskFour {

    public static void main(String[] params) {
		double first = Double.parseDouble(params[0]);
        double second = Double.parseDouble(params[1]);
        double hypotenuse = Math.sqrt(Math.pow(first,2) + Math.pow(second,2));
        System.out.println(hypotenuse);
    }
}
