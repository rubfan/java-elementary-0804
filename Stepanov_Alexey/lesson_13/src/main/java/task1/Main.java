package task1;

public class Main {
    public static void main(String[] args) {

        Commodity[] tech = new Commodity[3];
        tech[0] = new Commodity("TV", 15000, 8.7f);
        tech[1] = new Commodity("Washing machine", 7500, 7.5f);
        tech[2] = new Commodity("Washing machine", 7500, 7.5f);
        Category technicals = new Category("Technicals", tech);

        Commodity[] cp = new Commodity[3];
        cp[0] = new Commodity("Video card", 20000, 5.3f);
        cp[1] = new Commodity("Memory", 1200, 9.9f);
        cp[2] = new Commodity("HDD", 3500, 8.0f);
        Category computerParts = new Category("Computer Parts", cp);

        Commodity[] furn = new Commodity[3];
        furn[0] = new Commodity("Sofa", 15000, 8.7f);
        furn[1] = new Commodity("Table", 7500, 7.5f);
        furn[2] = new Commodity("Chair", 7500, 7.5f);
        Category furniture = new Category("Furniture", furn);

        Commodity[] purchases = new Commodity[4];
        purchases[0] = furn[0];
        purchases[1] = furn[2];
        purchases[2] = tech[0];
        purchases[3] = cp[1];
        Basket basket = new Basket(purchases);

        User user = new User("Bob", "takemymoney", "1234", basket);
    }
}
