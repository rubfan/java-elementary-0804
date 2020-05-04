public class Main10 {
    public static void main(String[] args) {
        int[] array = {3, 23, 11, 35, 78, 2, 9, 46, 5};
        boolean isSorted = false;
        int a;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    a = array[i];
                    array[i] = array[i+1];
                    array[i+1] = a;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
