public class task4 {
    public static void main(String[] args) {
        int numb1 = Integer.parseInt(args[0]);
        int numb2 = Integer.parseInt(args[1]);
        double hypotenuse = Math.sqrt(numb1 * numb1 + numb2 * numb2);
        System.out.println(hypotenuse);
	}
}