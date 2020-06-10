public class Task3 {
    public static void main(String[] args) {
        int numb1 = Integer.parseInt(args[0]);
        int numb2 = Integer.parseInt(args[1]);

        int distance1, distance2;

        if (numb1 > 10) {
            distance1 = numb1 - 10;
        } else {
            distance1 = 10 - numb1;
        }

        if (numb2 > 10) {
            distance2 = numb2 - 10;
        } else {
            distance2 = 10 - numb2;
        }

        if (distance1 > distance2) {
            System.out.println(numb2);
        } else {
            System.out.println(numb1);
        }
    }
}
