public class Task_6_HW_4 {
//   	 "Find cylinder volume".
   	 public static void main(String[] args) {
       		 double height = Double.parseDouble(args[0]);
       		 double radius = Double.parseDouble(args[1]);
       		 double cylinderVolume = Math.PI * Math.pow(radius, 2) * height;
       		 System.out.println("Cylinder volume is: " + cylinderVolume);
   	 }
}
