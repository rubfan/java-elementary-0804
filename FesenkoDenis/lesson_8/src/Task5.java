public class Task5 {

    public Task4 task4 = new Task4();

    public static void main(String[] args) {
        double[] first = new double[2];
        double[] second = new double[2];

        Task5 task5 = new Task5();
        task5.task4.fillArrayByRandom(first);
        task5.task4.bubbleSortWithoutRepeats(first);
        task5.task4.fillArrayByRandom(second);
        task5.task4.bubbleSortWithoutRepeats(second);
        sortTwoArrays(first, second);
        showArray(first);
        showArray(second);
    }

    public static void sortTwoArrays(double[] varF, double[] varS) {
        double[] emptyArr = new double[4];

        for (int i = 0, fir = 0, sec = 0; i < emptyArr.length; i++) {
            if (sec == varS.length) {
                emptyArr[i] = varF[fir];
            } else if (fir == varF.length) {
                emptyArr[i] = varS[sec];
            } else if (varF[fir] > varS[sec]) {
                emptyArr[i] = varS[sec];
                sec++;
            } else if (varF[fir] < varS[sec]) {
                emptyArr[i] = varF[fir];
                fir++;
            }
        }
        showArray(emptyArr);
    }

    public static void showArray(double[] arr) {
        for (double v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
