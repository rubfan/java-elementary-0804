public class Main {

    public boolean printPairSums(Integer[] arraySorted, int sumValue) {
        int firstIndexNumber = 0;
        int lastIndexNumber = arraySorted.length - 1;
        boolean result = false;
        while (firstIndexNumber < lastIndexNumber) {
            int pairSum = arraySorted[firstIndexNumber] + arraySorted[lastIndexNumber];
            if (pairSum == sumValue) {
                result = true;
                firstIndexNumber++;
                lastIndexNumber--;
            } else {
                if (pairSum < sumValue) firstIndexNumber++;
                else lastIndexNumber--;
            }
        }
        return result;
    }


    public Integer[] selectionSort(Integer[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                    counter++;
                }
            }
            int temp = array[i];
            array[i] = minValue;
            array[minIndex] = temp;
        }
        System.out.println(counter);
        return array;
    }


    public int printFibonacciSequenceMemberByRecursion(int memberNumber) {
        if (memberNumber == 0) {
            return 0;
        }
        if (memberNumber == 1) {
            return 1;
        } else {
            return printFibonacciSequenceMemberByRecursion(memberNumber - 1)
                    + printFibonacciSequenceMemberByRecursion(memberNumber - 2);
        }
    }

    public int printFibonacciSequenceMemberWithOutRecursion(int memberNumber) {
        int firstIndex = 0;
        int secondIndex = 1;
        for (int i = 2; i <= memberNumber; ++i) {
            int nextNumber = firstIndex + secondIndex;
            firstIndex = secondIndex;
            secondIndex = nextNumber;
        }
        return secondIndex;
    }
}
