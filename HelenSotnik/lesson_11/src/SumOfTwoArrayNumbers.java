package homework;

public class SumOfTwoArrayNumbers {
    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 12};
        int sum1 = 12;
        int sum2 = 3;
        int sum3 = 21;

        System.out.println(sumSearch(a, sum1));
        System.out.println(sumSearch(a, sum2));
        System.out.println(sumSearch(a, sum3));
    }

    protected static String sumSearch(int[] arr, int sum) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int newSum = 0;
        String result = "";

        while (leftIndex != rightIndex) {
            newSum = arr[leftIndex] + arr[rightIndex];
            if (newSum < sum) {
                leftIndex++;
            } else if (newSum > sum) {
                rightIndex--;
            } else if (newSum == sum) {
                result = "true as " + arr[leftIndex] + "+" + arr[rightIndex] + "=" + newSum;
                return result;
            }
        }
        result = "false as there are no two numbers in array that give " + sum + " in sum";
        return result;
    }
}