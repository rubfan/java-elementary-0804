public class task6 {
    public static void main(String[] args) {
        int numb1 = Integer.parseInt(args[0]);
        double numb2 = Double.parseDouble(args[1]);
        double volume = Math.PI * Math.pow(numb2, 2) * numb1;
        System.out.println(volume);
	}
}