package lesson13;

import java.util.Arrays;
/*
Создать класс lesson13.Category, имеющий переменные имя и массив товаров.
*/
public class Category {

    private String categoryName;
    private Product[] products;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Product[] getProducts() {
        return this.products;
    }

    public void setProducts(Product... products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "lesson13.Category{" +
                "categoryName='" + categoryName + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
