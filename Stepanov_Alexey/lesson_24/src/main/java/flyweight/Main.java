package flyweight;

public class Main {
    public static void main(String[] args) {
        PlaceLeaves placeLeaves = new PlaceLeaves();

        placeLeaves.place(15,17, "AA", "Green", "Oak");
        placeLeaves.place(25,11, "AB", "Red", "Pine");
        placeLeaves.place(75,31, "AC", "Green", "Palm");
        placeLeaves.place(55,31, "AA", "Green", "Oak");
        placeLeaves.place(45,31, "AC", "Green", "Palm");

        System.out.println("Leaves types: " + LeavesFactory.type.size());
        System.out.println("Leaves count: " + placeLeaves.getSize());
    }
}
/* output
Leaves types: 3
Leaves count: 5
 */