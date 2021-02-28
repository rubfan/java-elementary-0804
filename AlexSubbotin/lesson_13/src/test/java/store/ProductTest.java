package store;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ProductTest {

    private Product product = new Product("a", 10, (byte) 2);

    @Test
    public void testProductFields() {
        assertThat(product, Matchers.<Product>hasProperty("name"));
        assertThat(product, Matchers.<Product>hasProperty("price"));
        assertThat(product, Matchers.<Product>hasProperty("rate"));
    }
}
