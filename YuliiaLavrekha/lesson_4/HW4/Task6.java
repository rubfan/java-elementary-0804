package HW4;

public class Task6 {
    public static void main(String[] args) {
        double height = Double.parseDouble(args[0]);
        double radius = Double.parseDouble(args[1]);
        double cylinderVolume = Math.PI * height * Math.pow(radius, 2);
        System.out.println("Volume of the cylinder is: " + cylinderVolume);
    }
}
