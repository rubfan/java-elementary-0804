public class Power {
    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        int i = (int) Math.pow(a, b);
        System.out.println("В выбранной системе счисления " + i + " будет равно " + Integer.toString(i, c));
    }
}
