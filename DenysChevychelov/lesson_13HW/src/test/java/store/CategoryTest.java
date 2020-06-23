package store;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItemInArray;

public class CategoryTest {
    public Category telephones = new Category("TELEPHONES");
    public Category tvsets = new Category("TV");
    public Category computers = new Category("Computers");

    private Product iphone11 = new Product("Iphone 11", 1000, (byte) 10);
    private Product iphone10 = new Product("Iphone 10", 900, (byte) 9);
    private Product iphone8 = new Product("Iphone 8", 800, (byte) 8);

    private Product samsung75 = new Product("Samsung 75``", 1000, (byte) 10);
    private Product samsung65 = new Product("Samsung 65``", 900, (byte) 9);
    private Product samsung55 = new Product("Samsung 55``", 800, (byte) 8);

    private Product ibm = new Product("IBM", 360, (byte) 4);
    private Product hp = new Product("HP", 600, (byte) 7);
    private Product xiaomi = new Product("Xiaomi", 800, (byte) 9);

    @Test
    public void testCategoryFields() {
        assertThat(telephones, Matchers.<Category>hasProperty("categoryName"));
        assertThat(telephones, Matchers.<Category>hasProperty("products"));
    }

    @Test
    public void setProductsInTelephonesCategory() {
        telephones.setProducts(iphone8, iphone10, iphone11);
        assertThat(telephones.getProducts(), hasItemInArray(iphone8));
        assertThat(telephones.getProducts(), hasItemInArray(iphone10));
        assertThat(telephones.getProducts(), hasItemInArray(iphone11));
    }

    @Test
    public void setProductsInTVCategory() {
        tvsets.setProducts(samsung55, samsung65, samsung75);
        assertThat(tvsets.getProducts(), hasItemInArray(samsung55));
        assertThat(tvsets.getProducts(), hasItemInArray(samsung65));
        assertThat(tvsets.getProducts(), hasItemInArray(samsung75));
    }

    @Test
    public void setProductsInComputersCategory() {
        computers.setProducts(ibm, hp, xiaomi);
        assertThat(computers.getProducts(), hasItemInArray(ibm));
        assertThat(computers.getProducts(), hasItemInArray(hp));
        assertThat(computers.getProducts(), hasItemInArray(xiaomi));
    }
}