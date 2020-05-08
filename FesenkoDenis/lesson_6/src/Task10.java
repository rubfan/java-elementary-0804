import java.util.Random;

public class Task10 {

    public static void main(String[] args) {
        int[] vars = new int[20];
        Random random = new Random();
        for (int i = 0; i < vars.length; i++) {
            vars[i] = random.nextInt(100);
        }
        int free;
        for (int g = 0; g < vars.length-1; g++) {
            for (int i = 0; i < vars.length-1; i++) {
                for (int j = 1; j < vars.length-1; j++) {
                    if (vars[i] > vars[j]) {
                        free = vars[i];
                        vars[i] = vars[j];
                        vars[j] = free;
                    }
                    i++;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(vars[i]);
        }
    }
}
