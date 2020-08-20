package structure;

public class Product {
    private String name;
    private double price;
    private String rating;

    protected Product(String name, double price, String rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String n) {
        this.name = n;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double p) {
        this.price = p;
    }

    protected String getRating() {
        return rating;
    }

    protected void setRating(String r) {
        this.rating = r;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\"' +
                ", price=" + price +
                ", rating='" + rating + '\"' +
                '}';
    }
}
