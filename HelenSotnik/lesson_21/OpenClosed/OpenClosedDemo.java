package openclosed;

public class OpenClosedDemo {
    public static void main(String[] args) {
        BuildingAddress address1 = new BuildingAddress("Filatova");
        BuildingAddress address2 = new BuildingAddress("Mechnikova");
        BuildingAddress address3 = new BuildingAddress("Konovaltza");

        BuiltFloors house1 = new BuiltFloors(26, 12);
        BuiltFloors house2 = new BuiltFloors(24, 24);
        BuiltFloors house3 = new BuiltFloors(36, 10);

        System.out.println("Floors readiness: ");

        System.out.println("[" + address1.getAddress() + " - " + house1.showConstructionStage() + "]");
        System.out.println("[" + address2.getAddress() + " - " + house2.showConstructionStage() + "]");
        System.out.println("[" + address3.getAddress() + " - " + house3.showConstructionStage() + "]");
    }
}
