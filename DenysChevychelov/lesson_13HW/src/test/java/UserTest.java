import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import store.CategoryTest;
import store.Product;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UserTest {
    private CategoryTest categoryTest = new CategoryTest();
    private User firstUser = new User("aaa", "BBB");

    @Before
    public void initAssortment() {
        categoryTest.setProductsInTelephonesCategory();
        categoryTest.setProductsInTVCategory();
        categoryTest.setProductsInComputersCategory();
    }

    @Test
    public void testUserFields() {
        User user = new User("", "");
        assertThat(user, Matchers.<User>hasProperty("login"));
        assertThat(user, Matchers.<User>hasProperty("password"));
        assertThat(user, Matchers.<User>hasProperty("userBasket"));
    }

    @Test
    public void testUserAddToBasketIBMIphone10Samsung75() {
        Product[] storeAssortmentTelephones = categoryTest.telephones.getProducts();
        Product[] storeAssortmentTv = categoryTest.tvsets.getProducts();
        Product[] storeAssortmentComputers = categoryTest.computers.getProducts();

        User.Basket userBasket = firstUser.new Basket();
        userBasket.setBoughtProducts(
                storeAssortmentComputers[0],
                storeAssortmentTelephones[1],
                storeAssortmentTv[2]
        );
        assertThat(userBasket.getBoughtProducts()[0].getName(), (equalTo("IBM")));
        assertThat(userBasket.getBoughtProducts()[1].getName(), (equalTo("Iphone 10")));
        assertThat(userBasket.getBoughtProducts()[2].getName(), (equalTo("Samsung 75``")));
    }
}
