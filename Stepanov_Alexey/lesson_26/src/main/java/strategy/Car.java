package strategy;

public class Car implements DeliveryMethod{
    @Override
    public void send(Parcel parcel) {
        System.out.println("You parcel to : " + parcel.getAddress() +
                "\nWeight: " + parcel.getWeight() + "gm" +
                "\nWill be send by car");
    }
}
