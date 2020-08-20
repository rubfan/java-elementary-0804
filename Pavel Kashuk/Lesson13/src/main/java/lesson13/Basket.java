package lesson13;

import java.util.Arrays;
/*
Создать класс lesson13.Basket, содержащий массив купленных товаров.
*/
public class Basket {

    private Product[] purchasedProducts;

    public Basket(Product... purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public Product[] getPurchasedProducts() {
        return this.purchasedProducts;
    }

    public void setPurchasedProducts(Product... purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    @Override
    public String toString() {
        return "lesson13.Basket{" +
                "purchasedProducts=" + Arrays.toString(purchasedProducts) +
                '}';
    }
}
