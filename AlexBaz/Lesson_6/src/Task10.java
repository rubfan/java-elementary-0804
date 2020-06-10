public class Task10 {
    public static void main(String[] args) {
        int [] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 100);
        }
        int[] min = new int [5];
        for (int i = 0; i < 5 ; i++) {
            min[i] = ar[0];
            for (int j = 0; j < ar.length; j++) {
                if (i == 0) {
                    if (ar[j] <= min[0]) {
                        min[i] = ar[j];
                    }
                } else if (ar[j] <= min[i] && ar[j] > min[i-1]) {
                    min[i] = ar[j];
                }

            }
            System.out.printf(i+1 + " минимальный элемент массива = " + min[i] + "\n");
        }



    }
}
