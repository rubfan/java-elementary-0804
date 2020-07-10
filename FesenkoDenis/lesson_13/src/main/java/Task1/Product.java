package Task1;

import java.util.Arrays;

public class Product {
    private final String nameProduct;
    private final int price;
    private final int rating;

    public Product(String nameProduct, int price, int rating) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    static class Category {
        private String nameCategory;
        private Product[] productsArray;

        public Category(String nameCategory, Product[] productsArray) {
            this.nameCategory = nameCategory;
            this.productsArray = productsArray;
        }

        @Override
        public String toString() {
            return "Category{" +
                    "nameCategory='" + nameCategory + '\'' +
                    ", productsArray=" + Arrays.toString(productsArray) +
                    '}';
        }

        public String getNameCategory() {
            return nameCategory;
        }

        public void setNameCategory(String nameCategory) {
            this.nameCategory = nameCategory;
        }

        public Product[] getProductsArray() {
            return productsArray;
        }

        public void setProductsArray(Product[] productsArray) {
            this.productsArray = productsArray;
        }
    }

}


class Basket {
    static Product[] basketArray;

    public Basket(Product[] product) {
        basketArray = new Product[product.length];
        for (Product p : product
        ) {
            for (int i = 0; i < product.length; i++) {
                basketArray[i] = p;
            }
        }
    }

    public String info() {
        return Arrays.toString(basketArray);
    }

}

class User {
    String login;
    String pass;
    Basket objBascet;

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", objBascet=" + objBascet.info() +
                '}';
    }
}

class Interface {
    public static void main(String[] args) {
        User user = new User();
        user.login = "den";
        user.pass = "1111";

        Product product1 = new Product("IphoneX", 999, 8);
        Product product2 = new Product("Iphone8", 699, 5);
        Product product3 = new Product("Iphone7", 399, 7);
        Product[] massOfProducts1 = {product1, product2, product3};
        Product.Category mobiles = new Product.Category("Mobiles", massOfProducts1);

        Product product4 = new Product("Toaster", 59, 6);
        Product product5 = new Product("Kettle", 80, 7);
        Product product6 = new Product("Kettle2000", 66, 6);
        Product[] massOfProducts2 = {product4, product5, product6};
        Product.Category kitchen = new Product.Category("Kitchen", massOfProducts2);

        Product[] toBuy = {product1, product5};

        Basket basket = new Basket(toBuy);
        System.out.println(basket.info());
        user.objBascet = basket;

        System.out.println(user.toString());
    }
}
