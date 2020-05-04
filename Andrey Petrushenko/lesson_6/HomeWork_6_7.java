public class HomeWork_6_7 {
    public static void main(String[] args) {
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        int sumNotEven = 0;
        for (int i = 1; i < arr.length; i += 2) {
            if (i % 2 >= 0) {
                sumNotEven = sumNotEven + arr[i];
            }
        }
        System.out.println("Сумма всех нечетных элементов = " + sumNotEven);
        int sumEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 <= 0) {
                sumEven = sumEven + arr[i];
            }
        }
        System.out.print("Сумма всех четных элементов = " + sumEven);
    }
}
