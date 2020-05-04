public class Task6 {
    public static void main(String[] args) {
        int bill = Integer.parseInt(args[0]);
        String grade = args[1];
        int tips;
        if (grade.equals("poor")) {
            tips = 5;
        } else if (grade.equals("good")) {
            tips = 10;
        } else if (grade.equals("great")) {
            tips = 15;
        } else if (grade.equals("excellent")) {
            tips = 20;
        } else {
            tips = 0;
        }
        System.out.println(bill * tips / 100);
    }
}
