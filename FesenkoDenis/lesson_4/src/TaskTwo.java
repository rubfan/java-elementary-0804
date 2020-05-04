public class TaskTwo {

    public static void main(String[] params) {
        int first = Integer.parseInt(params[0]);
        int second = Integer.parseInt(params[1]);
        int third = Integer.parseInt(params[2]);
        int msg = (first >= second & first >= third) & (first > third || first > second) ? first
                : second >= third ? second
                : third;
        System.out.println(msg);
    }
}
