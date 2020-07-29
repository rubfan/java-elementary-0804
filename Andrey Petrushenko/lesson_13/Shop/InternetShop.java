package Shop;

class InternetShop {
    Product[] cellphone = new Product[3];
    Category phones = new Category("Phones", cellphone);

    {
        cellphone[0] = new Product("Apple", 25000, 10);
        cellphone[1] = new Product("Samsung", 10000, 8);
        cellphone[2] = new Product("Xiaomi", 5000, 6);

    }

    Product[] fotocamera = new Product[2];
    Category cameras = new Category("Cameras", fotocamera);

    {
        fotocamera[0] = new Product("Nikon", 20000, 9);
        fotocamera[1] = new Product("Canon", 18000, 8);
    }

    Product[] purchasedProduct = new Product[2];

    {
        purchasedProduct[0] = fotocamera[0];
        purchasedProduct[1] = cellphone[2];
    }

    Basket basket = new Basket(purchasedProduct);

    User user = new User("buyer", "3845", basket);
}
