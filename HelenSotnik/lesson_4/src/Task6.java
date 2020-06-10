public class Task6 {
    public static void main(String[] args) {
        double h = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double v = Math.PI * r * r * h;
        System.out.println("The volume of cylinder equals " + v);
    }
}
