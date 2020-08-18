public class Main {
    // 2) Определите сложность следующего алгоритма:
    public int task2() {
        int k = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    k++;
                }
            }
        }
        System.out.println("The result is O(n^3) " + k);
        System.out.println("Алгоритм имеет кубическую сложность, так как имеет тройной цикл");
        return k;
    }

    /* 3) Есть массив с числами упорядоченными по возрастанию,
нужно определить есть ли в этом массиве 2 числа, сумма которых равна "sum" */

    public int task3FirstCase(int[] arr1, int sum, int k) {
        boolean var = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] + arr1[j] == sum) {
                    var = true;
                    System.out.println(var + " так как " + arr1[i] + " + " + arr1[j] + " дают " + sum);
                    k++;
                    break;
                }
                k++;
            }
        }
        System.out.println("k = " + k);
        System.out.println("Алгоритм имеет квадратическую сложность");
        return k;
    }

    public int task3SecondCase(int[] arr1, int sum, int t) {
        boolean var = false;
        for (int i = arr1.length - 1; i > 0; i--) {
            if (arr1[i] < sum) {
                for (int j = 0; j < i; j++) {
                    if (arr1[i] + arr1[j] == sum) {
                        var = true;
                        System.out.println(var + " так как " + arr1[i] + " + " + arr1[j] + " дают " + sum);
                        t++;
                        break;
                    }
                    t++;
                }
            }
        }
        System.out.println("t = " + t);
        System.out.println("Алгоритм имеет квадратическую сложность. Более оптимальный");
        return t;
    }

    /*4) Сделайте сортировку выборкой, когда нужно найти минимальный элемент
         и посчитайте сколько на нее отводится операций(времени)
         попробуйте увеличить количество элементов в массиве и оценить на сколько увеличится время*/

    public int task4SelectionSort(int count, int position, int min, int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            min = arr1[i];
            position = i;
            for (int j = i + 1; j < arr1.length; j++) {
                count++;
                if (arr1[j] < min) {
                    position = j;
                    min = arr1[j];
                }
            }
            arr1[position] = arr1[i];
            arr1[i] = min;
        }
        System.out.println("The minimal element = " + arr1[0]);
        System.out.println("count = " + count);
        System.out.println("При увеличении количества елементов массива в 2 раза, время увеличивается примерно в 4 раза");
        return count;
    }

    public int task4SearchingForMinimalValue(int count, int position, int min, int[] arr1) {
        min = arr1[position];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
                position = i + 1;
            }
            count++;
        }
        System.out.println("The minimal element = " + min);
        System.out.println("position = " + position);
        System.out.println("count = " + count);
        return count;
    }

    //5) Напишите программу, которая выводит n-ый член последовательности Фибоначчи:
    public String task5FibonacciWithoutRecursion(int fibonacci, int first, int second, int current) {
        first = 0;
        second = 1;
        current = 1;

        for (int i = 1; i < fibonacci; i++) {
            current = first + second;
            first = second;
            second = current;
        }
        System.out.println("Сложность алгоритма без рекурсии является линейным O(n)");
        return "Number of Fibonacci with index " + fibonacci + " = " + current;
    }

    public int task5FWithRecursion(int f, int current) {
        current = 1;
        current = f > 1 ? current = task5FWithRecursion(f - 2, current) + task5FWithRecursion(f - 1, current) :
                f == 1 ? 1 : 0;
        return current;
//        "Сложность алгоритма с рекурсией является экспоненциальной O(2^n)" +
//        "C каждым вызовом метода стек вызовов увеличивается в 2 раза"
    }
}
