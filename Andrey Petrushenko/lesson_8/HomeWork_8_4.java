public class HomeWork_8_4 {

    public static void main(String[] args) {
        double[] array = new double[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + Math.random() * 50;
        }
        bubbleSort(array);
    }

    public static void bubbleSort(double[] m) {
        double temp;
        int cycle = 0;
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
            cycle++;
        }
        for (double i : m) {
            System.out.println(i);
        }
        System.out.println("Number of cycles " + cycle);
    }
}
