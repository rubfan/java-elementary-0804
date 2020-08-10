package Paint;

public class InfoAbout {
    private final int step = 500;
    private int price;

    public void infoAuction() {
        if (price > 0) {
            System.out.print("Current painting price: " + price + "\nMinimal step is: " + step + " $\n");
        } else {
            price = 1000;
            System.out.println("Minimal price " + price + " $");
        }
    }

    public void setPrice(int i) {
        if (i >= price + step) {
            System.out.println("You are an owner of the picture!");
            price = i;
        } else {
            System.out.println("Price proposed by you: " + i + " $");
            System.out.println("You must propose a price not lower than: " + (price + step) + " $");
        }
    }
}
