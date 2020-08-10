public class Task3 {
    public static void main(String[] args) {
        int[] array = {2, 6, 7, 11, 18, 23, 45, 56};
        System.out.println(findSum(array, 29));
        System.out.println(findSum(array, 35));
        System.out.println(findSum(array, 23));
    }

    public static boolean findSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
