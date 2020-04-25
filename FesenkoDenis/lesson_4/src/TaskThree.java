public class TaskThree {

    public static void main(String[] params) {
        int first = Integer.parseInt(params[0]);
        int second = Integer.parseInt(params[1]);
        int third = Integer.parseInt(params[2]);
        int pow = (int) Math.pow(first, second);
        String msg = third == 2 ? Integer.toBinaryString(pow)
                : third == 8 ? Integer.toOctalString(pow)
                : third == 16 ? Integer.toHexString(pow)
                : "An uncorrect number";
        System.out.println(msg);
    }
}
