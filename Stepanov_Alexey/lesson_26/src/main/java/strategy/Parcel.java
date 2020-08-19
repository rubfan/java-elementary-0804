package strategy;

public class Parcel {
    private int weight;
    private String address;

    public Parcel(int weight, String address) {
        this.weight = weight;
        this.address = address;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}