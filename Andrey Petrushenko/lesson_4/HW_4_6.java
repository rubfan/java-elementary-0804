public class HW_4_6 {
    public static void main(String[] args) {
        float r = Float.parseFloat(args[0]);
        float h = Float.parseFloat(args[1]);
        float p=(float) Math.PI;
        float vol = (p*(r*r)*h);
        System.out.println(vol);
    }
}