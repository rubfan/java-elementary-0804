public class Task5 {

    public static void main(String[] args) {
        int[] vars = new int[20];
        for (int i = 0; i < vars.length; i++) {
            vars[i] = i;
        }
        int sum = 0;
        int n = 0;
        while (n < 10) {
            sum += vars[n];
            n++;
        }
        System.out.println("sum = " + sum);
    }
}
