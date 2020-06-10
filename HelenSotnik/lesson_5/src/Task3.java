public class Task3 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        if (Math.abs(10 - n1) < Math.abs(10 - n2)) {
            System.out.println(n1 + " closer to 10!");
        } else {
            System.out.println(n2 + " closer to 10!");
        }
    }
}
