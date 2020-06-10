public class HomeWork_8_5 {
    public static void main(String[] args) {

        int[] arrFirst = new int[9];
        int[] arrSecond = new int[5];
        int[] arrResult = new int[arrFirst.length + arrSecond.length];
        int count = 0;
        for (int i = 0; i < arrFirst.length; i++) {
            arrFirst[i] = (int) (1 + Math.random() * 50);
        }
        for (int i = 0; i < arrSecond.length; i++) {
            arrSecond[i] = (int) (1 + Math.random() * 30);
        }
        for (int i = 0; i < arrFirst.length; i++) {
            arrResult[i] = arrFirst[i];
            count++;
        }
        for (int j : arrSecond) {
            arrResult[count++] = j;
        }
        System.out.print("First array= ");
        bubbleSort(arrFirst);
        System.out.println();
        System.out.print("Second array= ");
        bubbleSort(arrSecond);
        System.out.println();
        System.out.print("Result array= ");
        bubbleSort(arrResult);
    }

    public static void bubbleSort(int[] m) {
        int temp;
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i] > m[i + 1]) {
                    temp = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = temp;
                    change = true;
                }
            }
        }
        for (int i : m) {
            System.out.print(" " + i + " ");
        }
    }
}

