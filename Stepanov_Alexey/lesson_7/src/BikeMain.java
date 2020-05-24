public class BikeMain {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setModel("Big bike");
        bike.setWheelsNumbers(3);
        bike.setMountain(true);
        bike.setSpeedCount(10);
        bike.printBikeData();
    }
}
