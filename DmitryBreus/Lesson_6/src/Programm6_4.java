public class Programm6_4 {
    public static void main(String[] args) {
        int lenghtSqns = 20;
        double Res;
        System.out.println("Вывод первых 55-ти элементов последовательности");
        for (int i = 0; i != lenghtSqns; i++) {
            Res = Math.pow(2, i + 1);
            System.out.println("Res= " + Res + " " + i + "-й элемент");
        }
    }
}
