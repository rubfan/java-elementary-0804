public class task5 {
    public static void main(String[] args) {
        double score1 = Double.parseDouble(args[0]);
        double score2 = Double.parseDouble(args[1]);
        System.out.printf("%s: %.1f%%\n", args[2], (score1 / score2 - 1) * 100);
        System.out.printf("%s: %.1f%%\n", args[3], (score2 / score1 - 1) * 100);
	}
}