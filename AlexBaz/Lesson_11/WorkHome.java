public class WorkHome {
    //    3) Есть массив с числами упорядоченными по возрастанию, нужно определить есть ли в этом массиве 2 числа, сумма которых равна "sum".
    //            Методом findNumberLess отрезаю ту часть массива в которой значения выше чем у заданного числа
    public boolean findNumberLess(int[] arr, int sum) {
        int newSum = sum;
        int[] newArr = new int[arr.length];
        int variable = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= sum) {
                newArr[i] = arr[i];
                variable++;
            }
        }
        return isSumTwoNumbers(newArr, newSum, variable);
    }

    //    Метод isSumTwoNumbers определяет есть ли в этом массиве 2 числа, сумма которых равна "sum".
    public boolean isSumTwoNumbers(int[] arr2, int sum, int var) {
        boolean decision = false;
        for (int i = 0; i < var; i++) {
            for (int j = var - 1; j >= 0; j--) {
                int tho = arr2[i] + arr2[j];
                if (tho == sum) {
                    System.out.println(" true - так как " + arr2[i] + " + " + arr2[j] + " = " + sum);
                    decision = true;
                    arr2[j] = 0;
                }
            }
        }
        if (decision == false) {
            System.out.println(" false - так как нет двух чисел, которые в сумме дают " + sum);
        }
        return decision;
    }

    //4) Сделайте сортировку выборкой, когда нужно найти минимальный элемент и посчитайте сколько на нее отводится операций(времени)
    //    попробуйте увеличить количество элементов в массиве и оценить на сколько увеличится время
    public int selectionSorter(int[] array) {
        int operations = 0;
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                    operations++;
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        return operations;
    }


}
