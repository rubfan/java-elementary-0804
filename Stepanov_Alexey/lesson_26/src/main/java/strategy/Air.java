package strategy;

public class Air implements DeliveryMethod {
    Parcel parcel;

    @Override
    public void send(Parcel parcel) {
        System.out.println("You parcel to : " + parcel.getAddress() +
                "\nWeight: " + parcel.getWeight() + "gm" +
                "\nWill be send by air");
    }
}