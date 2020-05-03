public class Task4 {
    public static void main(String[] args) {
        int numb1 = Integer.parseInt(args[0]);
        int numb2 = Integer.parseInt(args[1]);
        int numb3 = Integer.parseInt(args[2]);

        int min = numb1;

        if (numb2 < min) {
            min = numb2;
        }
        if (numb3 < min) {
            min = numb3;
        }

        if (numb1 == min) {
            System.out.println(numb1);
        }
        if (numb2 == min) {
            System.out.println(numb2);
        }
        if (numb3 == min) {
            System.out.println(numb3);
        }
    }
}
