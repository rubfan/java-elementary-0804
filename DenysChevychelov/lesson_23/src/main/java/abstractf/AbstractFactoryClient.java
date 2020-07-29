package abstractf;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        DodgeFactory dodge = new DodgeFactory();
        VolkswagenFactory volkswagen = new VolkswagenFactory();

        AbstractCarFactory acf = new AbstractCarFactory(dodge);
        Pickup pickup = acf.createPickup();
        System.out.println(pickup);

        acf.setFactory(volkswagen);
        pickup = acf.createPickup();
        Sedan sedan = acf.createSedan();
        System.out.println(sedan);
        System.out.println(pickup);
    }
}
