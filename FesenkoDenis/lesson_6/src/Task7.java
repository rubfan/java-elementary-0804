public class Task7 {

    public static void main(String[] args) {
        int[] vars = new int[20];
        for (int i = 0; i < vars.length; i++) {
            vars[i] = i;
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int v : vars) {
            if (v % 2 == 0) {
                sumEven += v;
            } else {
                sumOdd += v;
            }
        }
        System.out.println("Сумма четных: " + sumEven);
        System.out.println("Сумма нечеиных: " + sumOdd);
    }
}
