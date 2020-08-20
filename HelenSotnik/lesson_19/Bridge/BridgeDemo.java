package bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Product tShirtNike = new TShirt(new Nike());
        Product snickersNike = new Snickers((new Nike()));

        System.out.println(tShirtNike.produce() + "\n"
                + snickersNike.produce() + "\n");

        Product tShirtUA = new TShirt(new UnderArmour());
        Product snickersUA = new Snickers(new UnderArmour());

        System.out.println(tShirtUA.produce() + "\n"
                + snickersUA.produce());
    }
}
