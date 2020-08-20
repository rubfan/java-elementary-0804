package iterator;

public class IteratorClient {
    public static void main(String[] args) {
        String[] products = {"prod1", "prod2", "prod3", "prod4", "prod5", "prod6", "prod7", "prod8",};
        Stock stock = new Stock("Stock #7", products);

        Iterator iterator = stock.getIterator();
        System.out.println("Stock #7 has: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
