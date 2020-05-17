import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        double[] vars = new double[10];
        int count = 0;

        fillArrayByRandom(vars);
        bubbleSort(vars, count);
        showArray(vars);
    }

    public static void fillArrayByRandom(double[] vars) {
        Random random = new Random();
        for (int i = 0; i < vars.length; i++) {
            vars[i] = random.nextDouble() * 10;
        }
    }

    public static void bubbleSort(double[] vars, int count) {
        boolean repeat = true;
        double free;
        while (repeat) {
            repeat = false;
            for (int i = 0; i < (vars.length - 1); i++) {
                if (vars[i] > vars[i + 1]) {
                    free = vars[i];
                    vars[i] = vars[i + 1];
                    vars[i + 1] = free;
                    repeat = true;
                }
                count++;
            }
            count++;
        }
        System.out.println(count + " iterations");
    }

    public static void showArray(double[] arr) {
        for (double v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
