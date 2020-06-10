public class Task6 {
    public static void main(String[] args) {
        int [] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 100);
        }
        int maxNumber = ar[0];
        int minNumber = ar[0];
        for (int j = 0; j <ar.length ; j++) {
            if(minNumber > ar[j]) {
                minNumber = ar[j];
            }
            if(maxNumber < ar[j]) {
                maxNumber = ar[j];
            }
        }
        System.out.println("Минимальный элемент = " + minNumber);
        System.out.println("Максимальный элемент = " + maxNumber);
    }
}
