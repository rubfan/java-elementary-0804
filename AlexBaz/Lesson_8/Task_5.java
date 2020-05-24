public class Task_5 {
    static double[] ar3;

    public static void main(String[] args) {
        double[] ar1 = Task_4.mainAr();
        System.out.println();
        double[] ar2 = Task_4.mainAr();
        System.out.print("\n" + "Sum -  ");
        sumAr(ar1, ar2);
        System.out.println();
        System.out.print("Sort -  ");
        Task_4.sortedAr(ar3);
    }

    public static double[] sumAr(double[] a, double[] b) {
        ar3 = new double[a.length + b.length];
        for (int i = 0; i < ar3.length; i++) {
            if (i < a.length) {
                ar3[i] = a[i];
            } else
                ar3[i] = b[i - a.length];
        }
        for (int i = 0; i < ar3.length; i++) {
            System.out.print((int) ar3[i] + " ");
        }
        return ar3;
    }
}