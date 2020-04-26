public class task2 {
    public static void main(String[] args) {
        int numb1 = Integer.parseInt(args[0]);
        int numb2 = Integer.parseInt(args[1]);
        int numb3 = Integer.parseInt(args[2]);
        System.out.println((numb1 > numb2) & (numb1 > numb3) ? numb1 : numb2 > numb3 ? numb2 : numb3);
	}
}