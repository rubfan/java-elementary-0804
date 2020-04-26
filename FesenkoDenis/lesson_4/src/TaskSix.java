public class TaskSix {

	public static void main(String[] params) {
		double radius = Double.parseDouble(params[0]);
		double height = Double.parseDouble(params[1]);
		double area = Math.PI * Math.pow(radius, 2) * height;
		System.out.println("Area is: " + area);
	}
}