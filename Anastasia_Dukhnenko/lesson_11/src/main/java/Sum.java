public class Sum {
    public boolean findOutTheAnswer(Integer[] array, int requiredSum) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        boolean result = false;
        while (firstIndex < lastIndex) {
            int sum = array[firstIndex] + array[lastIndex];
            if (requiredSum == sum) {
                result = true;
                firstIndex++;
                lastIndex--;
            } else {
                if (sum < requiredSum) {
                    firstIndex++;
                } else {
                    lastIndex--;
                }
            }
        }
        return result;
    }
}
