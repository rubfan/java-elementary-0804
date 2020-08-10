public class FibonacciSequence {
    //    5) Напишите программу, которая выводит n-ый член последовательности Фибоначчи:
    //    Также определите сложность вашего решения
    private int n1 = 1;
    private int n2 = 1;

    //    Задачу нужно решить с рекурсией
    public int createFibonacciSequenceRecursion(int number) {
        int result = 0;
        int operations = 0;
        int n = 2;
        if (number < 3) {
            result = 1;
            operations++;
        }
        while ((number - n) != 0) {
                result = fibonacciSequenceRecursion();
                operations++;
                n++;
            }

        System.out.println(number + " # sequence fibonacci = " + result);
        System.out.println("used " + operations + " recursion");
        return result;
    }

        public int fibonacciSequenceRecursion () {
            int result = n1 + n2;
            n1 = n2;
            n2 = result;
            return result;
        }

        //     и без ее использования
        public int createFibonacciSequenceNotRecursion ( int length){
            int[] arr = new int[length];
            arr[0] = 1;
            arr[1] = 1;
            int operations = 0;
            int result;
            for (int i = 2; i < length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
                operations++;
            }
            result = arr[length - 1];
            System.out.println(length + " # sequence fibonacci = " + result);
            System.out.println("used " + operations + "  not recursion");
            return result;
        }

    }
