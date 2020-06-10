public class task2 {
    public static void main(String[] args) {
        int numb1 = Integer.parseInt(args[0]);
        int numb2 = Integer.parseInt(args[1]);
        int numb3 = Integer.parseInt(args[2]);
        int firstPairMax = numb1 > numb2 ? numb1 : numb2;
        int result = firstPairMax > numb3 ? firstPairMax : numb3;
        System.out.println(result);
	}
}