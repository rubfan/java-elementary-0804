public class Task5 {
    public static void main(String[] args) {
        int numb1 = Integer.parseInt(args[0]);
        String operation = args[1];
        int numb2 = Integer.parseInt(args[2]);

        if (operation.equals("*")) {
            System.out.println(numb1 * numb2);
        } else if (operation.equals("/")) {
            System.out.println((double) numb1 / (double) numb2);
        } else if (operation.equals("+")) {
            System.out.println(numb1 + numb2);
        } else if (operation.equals("-")) {
            System.out.println(numb1 - numb2);
        } else if (operation.equals("%")) {
            System.out.println(numb1 % numb2);
        } else if (operation.equals("abs")) {
            System.out.println(Math.abs(numb1));
        }
    }
}
