package HW5;

public class Calculator {
// to find absolute value of a number, use | ; for instance: | -6 |

    public static void main(String[] args) {
        if (args[0].equals("|") && args[2].equals("|") ) {
            System.out.println(Math.abs(Integer.parseInt(args[1])));
        } else {
            int first = Integer.parseInt(args[0]);
            int second = Integer.parseInt(args[2]);
            if (args[1].equals("+")) {
                System.out.println(first + second);
            } else if (args[1].equals("-")) {
                System.out.println(first - second);
            } else if (args[1].equals("*")) {
                System.out.println(first * second);
            } else if (args[1].equals("/")) {
                System.out.println(first / second);
            } else if (args[1].equals("%")) {
                System.out.println(first % second);
            }
        }
    }
}
