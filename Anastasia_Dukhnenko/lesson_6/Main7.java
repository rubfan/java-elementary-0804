public class Main7 {
    public static void main(String[] args) {
        int[] array = {3, 6, 11, 13, 4};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                sum1 += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                sum2 += array[i];

        }
        System.out.println("Сумма нечётных элементов = " + sum1);
        System.out.println("Сумма чётных элементов = " + sum2);
    }
}
