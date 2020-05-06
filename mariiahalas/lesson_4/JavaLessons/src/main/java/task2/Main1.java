package task2;

public class Main1 {
    public static void main(String[] args) {
        int arg1 = Integer.parseInt(args[2]), arg2 = Integer.parseInt(args[3]), arg3 = Integer.parseInt(args[4]);
        int max = arg1 > arg2 ? (arg1 > arg3 ? arg1 : arg3) : (arg2 > arg3 ? arg2 : arg3);
        System.out.println(max);
    }
}
