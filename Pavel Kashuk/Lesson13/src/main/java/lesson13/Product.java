package lesson13;
/*
Создать класс Товар, имеющий переменные имя, цена, рейтинг.
*/
public class Product {

    private String productName;
    private double productPrice;
    private double productRating;

    public Product(String name, double price, double rate) {
        this.productName = name;
        this.productPrice = price;
        this.productRating = rate;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductRating() {
        return this.productRating;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    @Override
    public String toString() {
        return "lesson13.Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productRating=" + productRating +
                '}';
    }
}
