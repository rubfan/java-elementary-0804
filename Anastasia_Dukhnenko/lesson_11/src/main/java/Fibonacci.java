public class Fibonacci {
    public int solveWithRecursion(int necessaryIndex) {
        if (necessaryIndex == 0) {
            return 0;
        }
        if (necessaryIndex == 1 || necessaryIndex == 2) {
            return 1;
        } else {
            return solveWithRecursion(necessaryIndex - 2)
                    + solveWithRecursion(necessaryIndex - 1);
        }
    }

    public int solveWithoutRecursion(int necessaryIndex) {
        int firstIndex = 0;
        int secondIndex = 1;
        for (int i = 2; i <= necessaryIndex; i++) {
            int nextNumber = firstIndex + secondIndex;
            firstIndex = secondIndex;
            secondIndex = nextNumber;
        }
        return secondIndex;
    }
}
