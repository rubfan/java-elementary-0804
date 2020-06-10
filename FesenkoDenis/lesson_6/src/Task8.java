public class Task8 {

    public static void main(String[] args) {
        int max = 999999;
        String[] vars = new String[max];
        for (int j = 0; j < vars.length; j++) {
            vars[j] = String.valueOf(j + 100000);
        }
        for (int i = 0; i <= 899999; i++) {
            String str = vars[i];
            if (str.charAt(0) + str.charAt(1) + str.charAt(2) == str.charAt(3) + str.charAt(4) + str.charAt(5)) {
                System.out.println(str);
            }
        }
    }
}
