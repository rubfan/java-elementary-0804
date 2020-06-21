public class Task_4 {
    static int result = 0;
    static double[] ar = new double[10];

    public static void main(String[] args) {
        mainAr();
        System.out.println();
        System.out.print("Has become -  ");
        sortedAr(ar);

        System.out.println("\n" + "Attempts -  " + result);
    }

    public static double[] mainAr() {

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (double) (Math.random() * 100);
        }
        System.out.print("It was -  ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print((int) ar[i] + " ");
        }
        return ar;
    }

    public static double[] sortedAr(double[] sort) {

        boolean isSorted = false;
        double buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < sort.length - 1; i++) {
                if (sort[i] > sort[i + 1]) {
                    isSorted = false;
                    buffer = sort[i];
                    sort[i] = sort[i + 1];
                    sort[i + 1] = buffer;
                }
            }
            result++;
        }

        for (int i = 0; i < sort.length; i++) {
            System.out.print((int) sort[i] + " ");
        }
        return sort;
    }
}
