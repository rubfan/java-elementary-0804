public class TaskThreeClass {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int numSys = Integer.parseInt(args[2]);
        int c = (int) Math.pow(a, b);
        String numeralSystem = Integer.toString(c,numSys);
        System.out.println("1st number to the power of 2nd number in chosen numeral system : " + numeralSystem);
    }
}
