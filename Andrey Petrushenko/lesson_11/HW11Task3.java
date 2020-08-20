public class HW11Task3 {
    //Task 3 Есть массив с числами упорядоченными по возрастанию,
    // нужно определить есть ли в этом массиве 2 числа, сумма которых равна "sum".
    public static boolean getFindSumElements(int[] intArray, int sum, int first, int last) {

        while (intArray[first] != intArray[last]) {
            int tempSum = intArray[first] + intArray[last];
            if (tempSum < sum) {
                first++;
            } else if (tempSum > sum) {
                last--;
            } else if (tempSum == sum) {
                System.out.println("true - так как " + intArray[first] + " + " + (sum - intArray[first] + " = " + sum));
                return true;
            }
        }
        System.out.println("false- так как в данном масиве нет двух чисел, которые в сумме дают " + sum);
        return false;
    }
}
