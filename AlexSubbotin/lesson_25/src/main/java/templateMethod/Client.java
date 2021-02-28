package templateMethod;

public class Client {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
