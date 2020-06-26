package secondTask;
//            2) Сопоставьте область видимости и модификаторы доступа, для каждой области возможны несколько вариантов.
//
//            private default protected public

//        1. Один и тот же класс
//
//        2. Подкласс, находящийся в том же пакете, что и суперкласс
//
//        3. Класс из того же самого пакета, не являющийся подклассом.
//
//        4. Подкласс, находящийся в другом пакете.
//
//        5. Класс из другого пакета, не являющийся подклассом данного.
public class A {
    private String task2Private = "private";
    String task2Defult = "default";
    protected String task2Protected = "protected";
    public String task2Public = "public";

    public  void main() {

        String a1 = task2Private;
        String a2 = task2Defult;
        String a3 = task2Protected;
        String a4 = task2Public;
    }
}
