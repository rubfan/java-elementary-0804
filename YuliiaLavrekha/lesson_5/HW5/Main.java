package HW5;

public class Main {
    public static void main(String[] args) {
        checkIfEven(25); // Task 1
        showIfMultiple(59, 2); // Task 2
        closerToTen(8, 15); // Task 3
        smallestNumber(5, 5, 5); // Task 4
        System.out.println("Rent: " + rent(8)); // Task 7
    }

    // Task 1
    public static void checkIfEven(int x) {
        boolean isEven = x % 2 == 0;
        if (isEven) {
            System.out.println(x + " is an even number.");
        } else {
            System.out.println(x + " is an odd number.");
        }
    }

    // Task 2
    public static void showIfMultiple(int a, int b) {
        System.out.print("Is " + a + " a multiple of " + b + "? ");
        if (a % b == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Task 3
    public static void closerToTen(int c, int d) {
        if (Math.abs(c - 10) == Math.abs(d - 10)) {
            System.out.println(c + " and " + d + " are equally close to 10.");;
        } else if (Math.abs(c - 10) < Math.abs(d - 10)) {
            System.out.println(c + " is closer to 10.");
        } else {
            System.out.println(d + " is closer to 10.");
        }
    }

    // Task 4
    public static void smallestNumber(int e, int f, int g) {
        System.out.print("Minimal number(s): ");
        if (e == f && f == g) {
            System.out.println(e + ", " + f + ", " + g);
        } else if (e == f) {
            if (e < g) {
                System.out.println(e + ", " + f);
            } else {
                System.out.println(g);
            }
        } else if (f == g) {
            if (e > f) {
                System.out.println(f + ", " + g);
            } else {
                System.out.println(e);
            }
        } else if (e == g) {
            if (e < f) {
                System.out.println(e + ", " + g);
            } else {
                System.out.println(f);
            }
        } else {
            if (e < f && e < g) {
                System.out.println(e);
            } else if (f < g) {
                System.out.println(f);
            } else {
                System.out.println(g);
            }
        }
    }

    //Task 7
    public static int rent(int days) {
        int rent = days * 40;
        if (days > 7) {
            rent = rent - 50;
        } else if (days > 5) {
            rent = rent - 20;
        }
        return rent;
    }
}
