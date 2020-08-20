package firstTask;

public class InternetShop {

    Category category1 = new Category("Mouse", new Product[]
            {new Product("A4tech", 240.00, 3),
                    new Product("Trust", 249.99, 2),
                        new Product("Logitech", 320.00, 1)});

    Category category2 = new Category("Optical drives", new Product[]
            {new Product("Asus", 440.00, 3),
                    new Product("LabelFlesh", 549.99, 2),
                        new Product("Philips", 720.00, 1)});

    Category category3 = new Category("Cooling systems", new Product[]
            {new Product("PcCooler", 580.00, 3),
                    new Product("Zalman", 649.99, 2),
                        new Product("DeepCool", 920.00, 1)});


    User user1 = new User("AlexBaz", "qwerty123456", new Basket(new Product[]{
            new Product("A4tech", 240.00, 3),
                new Product("LabelFlesh", 549.99, 2),
                    new Product("DeepCool", 920.00, 1)}));


}
