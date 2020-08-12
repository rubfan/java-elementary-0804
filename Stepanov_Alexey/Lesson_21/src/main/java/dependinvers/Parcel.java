package dependinvers;

public class Parcel {
    private int weight;
    private DeliveryMethod deliveryMethod;

    public Parcel(int weight, DeliveryMethod deliveryMethod) {
        this.weight = weight;
        this.deliveryMethod = deliveryMethod;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void delivery () {
        deliveryMethod.delivery();
    }
}
