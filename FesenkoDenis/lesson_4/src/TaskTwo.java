public class TaskTwo {

    public static void main(String[] params) {
        double first = Double.parseDouble(params[0]);
        double second = Double.parseDouble(params[1]);
        double third = Double.parseDouble(params[2]);
        double msg = (first >= second & first >= third) & !(first < third || first < second) ? first
                : second >= third ? second
                : third;
        System.out.println(msg);
    }
}
