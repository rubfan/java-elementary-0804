public class Programm6_2 {
    public static void main(String[] args) {
        int lenghtSqns = 55;
        int a = -1;
        System.out.println("Вывод первых 55-ти элементов последовательности");
        for (int i = 0; i != lenghtSqns; i++) {
            a = a + 2;
            System.out.println("a= " + a + " " + i + "-й элемент");
        }
    }
}
