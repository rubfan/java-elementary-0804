public class HW11Task4 {
    //Task 4 Сделайте сортировку выборкой,
    // когда нужно найти минимальный элемент и посчитайте сколько на нее отводится операций(времени)
    //попробуйте увеличить количество элементов в массиве и оценить на сколько увеличится время

    public static void getSortSelect(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int numCell = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < min) {
                    numCell = j;
                    min = arr[j];
                }
            arr[numCell] = arr[i];
            arr[i] = min;
            count++;
        }
        System.out.println("min element of array = " + arr[0]);
        System.out.println("number of cycles = " + count);
    }
}
