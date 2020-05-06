public class Cylinder {
    public static void main(String[] params) {
        double h = Double.parseDouble(params[0]);
        double r = Double.parseDouble(params[1]);
        double v = Math.PI * Math.pow(r, 2) * h;
        System.out.println(v);
    }
}
