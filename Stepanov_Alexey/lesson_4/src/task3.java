public class task3 {
    public static void main(String[] args) {
        int numb1 = Integer.parseInt(args[0]);
        int numb2 = Integer.parseInt(args[1]);
        int numbSyst = Integer.parseInt(args[2]);
        double powerResult = Math.pow(numb1, numb2);
        System.out.println(Integer.toString((int) powerResult, numbSyst));
	}
}