package store;

public class Product {

    private String name;
    private int price;
    private byte rate;

    protected Product(String name, int price, byte rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public byte getRate() {
        return this.rate;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setRate(byte rate) {
        this.rate = rate;
    }
}
