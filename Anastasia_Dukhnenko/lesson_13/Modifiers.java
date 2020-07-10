public class Modifiers {
    public static void main(String[] args) {
        System.out.println("(A)private (B)default (C)protected (D)public");
        System.out.println("1) Один и тот же класс - A, B, C, D.");
        System.out.println("2) Подкласс, находящийся в том же пакете, " +
                "что и суперкласс - B, C, D.");
        System.out.println("3) Класс из того же самого пакета, " +
                "не являющийся подклассом - B, C, D.");
        System.out.println("4) Подкласс, находящийся в другом " +
                "пакете - C, D.");
        System.out.println("5) Класс из другого пакета, " +
                "не являющийся подклассом данного - D.");
    }
}
