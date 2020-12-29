public class Main {
    public static void main(String[] args) {
        //          1) Создайте программу, выводящую на экран все четырёхзначные
        //          числа последовательности 1000 1003 1006 1009 1012 1015 ….
        taskOne();
        //          2) Создайте программу, выводящую на экран первые 55 элементов
        //          последовательности 1 3 5 7 9 11 13 15 17 ….
        taskTwo();
        //          3) Создайте программу, выводящую на экран все неотрицательные элементы
        //          последовательности 90 85 80 75 70 65 60 ….
        taskThree();
        //          4) Создайте программу, выводящую на экран первые 20 элементов
        //          последовательности 2 4 8 16 32 64 128 ….
        taskFour();
        //          5) Найти сумму первых n элементов массива
        int n = 5;
        int[] arr = new int[]{200, 100, -3, 400, 2, 600, 1, 100, 150, -9, 10, 23, 40, 56, 100};
        taskFive(arr, n);
        //          6) Найти минимальный и максимальный элемент массива
        taskSix(arr);
        //          7) Найти сумму всех четных и сумму всех нечетных элементов массива
        taskSeven(arr);
        //          8) Найти все счастливые билеты от 100000 до 999999 :
        //          билет счастливый если сумма первых трех цифр равна сумме трех последних
        //          например, 123312: 1+2+3==3+1+2
        taskEight();
        //          9) Создайте программу которая устанавливает введеный номер бита в 1 у введенного числа,
        //          выведите на экран полученое число в двоичной и десятеричной системе счисления
        taskNine(8, 10);
        //          10) Вывести первые 5 минимальных элементов массива
        taskTen(arr);
    }

    public static void taskOne() {
        System.out.println("TASK 1");
        for (int i = 1000; i < 10000; i += 3) {
            System.out.println(i);
        }
    }

    public static void taskTwo() {
        System.out.println("TASK 2");
        int counter = 0;
        for (int i = 1; ; i += 2) {
            System.out.println(i);
            counter++;
            if (counter == 55) {
                break;
            }
        }
    }

    public static void taskThree() {
        System.out.println("TASK 3");
        for (int i = 90; i >= 0; i -= 5) {
            System.out.println(i);
        }
    }

    public static void taskFour() {
        System.out.println("TASK 4");
        int startNumber = 2;
        int counter = 0;
        for (int i = 0; ; i++) {
            System.out.println(startNumber << i);
            counter++;
            if (counter == 20) {
                break;
            }
        }
    }

    public static void taskFive(int array[], int n) {
        System.out.println("TASK 5");
        int sumElements = 0;
        for (int i = 0; i < n; i++) {
            sumElements += array[i];
        }
        System.out.println(sumElements);
    }

    public static void taskSix(int array[]) {
        System.out.println("TASK 6");
        int minElement = array[0];
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= minElement) {
                minElement = array[i];
            }
            if (array[i] >= maxElement) {
                maxElement = array[i];
            }
        }
        System.out.println("Minimal element of array: " + minElement);
        System.out.println("Maximal element of array: " + maxElement);
    }

    public static void taskSeven(int array[]) {
        System.out.println("TASK 7");
        int sumEvenElements = 0;
        int sumOddElements = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                sumEvenElements += element;
            } else {
                sumOddElements += element;
            }
        }
        System.out.format("Even elements sum: %d\n", sumEvenElements);
        System.out.format("Odd elements sum: %d\n", sumOddElements);
    }

    public static void taskEight() {
        System.out.println("TASK 8");
        int luckyTicketCounter = 0;
        for (int ticketNumber = 100_000; ticketNumber <= 999_999; ticketNumber++) {
            int leftPartSum = ticketNumber / 100_000 + (ticketNumber / 10_000) % 10 + (ticketNumber / 1_000) % 10;
            int rightPartSum = (ticketNumber / 100) % 10 + (ticketNumber / 10) % 10 + ticketNumber % 10;
            if (leftPartSum == rightPartSum) {
                luckyTicketCounter++;
            }
        }
        System.out.println("The number of lucky tickets: " + luckyTicketCounter);
    }

    public static void taskNine(int bitNumber, int number) {
        System.out.println("TASK 9");
        int binaryBitNumber = (int) Math.pow(2, (bitNumber - 1));
        int result = number | binaryBitNumber;
        System.out.println("Entered bit number: " + bitNumber);
        System.out.println("Entered number: " + Integer.toBinaryString(number));
        System.out.println("Switched bit number: " + Integer.toBinaryString(result));
        System.out.println("Decimal result: " + result);
    }

    public static void taskTen(int array[]) {
        System.out.println("TASK 10");
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
