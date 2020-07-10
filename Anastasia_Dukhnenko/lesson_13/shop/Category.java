package shop;

public class Category {
    private String name;
    private Product[] listOfGoods;

    public Category(String name, Product[] listOfGoods) {
        this.name = name;
        this.listOfGoods = listOfGoods;
    }
}
