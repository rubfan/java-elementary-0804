public class HomeWork_6_6 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30);
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Наибольший элемент: " + max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Наименьший элемент: " + min);
    }
}


