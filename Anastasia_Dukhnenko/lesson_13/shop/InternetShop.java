package shop;

public class InternetShop {
    Category category1 = new Category("Lipsticks", new Product[]
            {new Product("Rouge Coco", 40,  8),
                    new Product("CAMÉLIAS D'EAU", 66, (float) 9.2),
                            new Product("Rouge Allure", 46, 7)});

    Category category2 = new Category("Perfums", new Product[]
            {new Product("Gabrielle", 175, (float) 9.8),
                    new Product("№ 5", 160, (float) 7.5),
                            new Product("PARIS-RIVIERA", 135, 9)});

    Category category3 = new Category("Jewerly", new Product[]
            {new Product("Extrait de camélia", 6300, (float) 9.9),
                    new Product("Bracelet Ultra", 15500, 7),
                            new Product("Lion sculptural", 19900, 8)});

    User user = new User("anaduh2018", "yioula2018", new Basket(new Product[]
            {new Product("Gabrielle", 175, (float) 9.8),
                    new Product("Rouge Allure", 46, 7)}));
}