package structure;

import java.util.Arrays;

public class Basket {
    private Product[] productsInBasket;

    protected Basket(Product[] products) {
        this.productsInBasket = products;
    }

    protected Product[] getProducts() {
        return productsInBasket;
    }

    protected void setProducts(Product[] basketPr) {
        this.productsInBasket = basketPr;
    }

    @Override
    public String toString() {
        return "\n" + Arrays.toString(productsInBasket);
    }
}
