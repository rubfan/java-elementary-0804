public class HomeWork_6_8 {
    public static void main(String[] args) {
        int lucky = 0;
        for (int num = 100000; num <= 999999; num++) {
            if ((num / 100000) + ((num % 100000) / 10000) + ((num % 10000) / 1000) ==
                    ((num % 1000) / 100) + ((num % 100) / 10) + (num % 10)) {
                lucky ++;
                System.out.println(num);
            }
        }
        System.out.println("Колличество  счастливых билетов = " + lucky);
    }
}




