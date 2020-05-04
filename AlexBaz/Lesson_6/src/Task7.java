public class Task7 {
    public static void main(String[] args) {
        int [] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 100);
        }
        int sumNumberEven = 0;
        int sumNumberOdd = 0;
        for (int j = 0; j <ar.length ; j++) {
            if(ar[j] % 2 == 0) {
                sumNumberEven += ar[j];
            }
            if(ar[j] % 2 != 0) {
                sumNumberOdd += ar[j];
            }
        }
        System.out.println("Сумма четных элементов = " + sumNumberEven);
        System.out.println("Сумма нечетных элементов = " + sumNumberOdd);
    }
}