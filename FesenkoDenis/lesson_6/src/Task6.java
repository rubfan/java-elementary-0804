public class Task6 {

    public static void main(String[] args) {
        int[] vars = new int[10];
        for (int i = 0; i < 10; i++) {
            vars[i] = i * 5;
        }
        int max = vars[0], min = vars[0];
        for (int var : vars) {
            for (int j = 1; j < vars.length; j++) {
                if (var < vars[j] & max < vars[j]) {
                    max = vars[j];
                }
            }
            for (int j = 1; j < vars.length; j++) {
                if (var > vars[j] & min > vars[j]) {
                    min = vars[j];
                }
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
