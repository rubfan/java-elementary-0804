package strategy;

public class Main {

    public static void main(String[] args) {
        Parcel parcel = new Parcel(50, "Europe");

        DeliveryMethod method = new Air();
        method.send(parcel);

        DeliveryMethod method1 = new Ship();
        method1.send(parcel);

        DeliveryMethod method2 = new Car();
        method2.send(parcel);
    }
}
/*
You parcel to : Europe
Weight: 50gm
Will be send by air
You parcel to : Europe
Weight: 50gm
Will be send by ship
You parcel to : Europe
Weight: 50gm
Will be send by car
 */
