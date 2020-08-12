package template.method;

public abstract class ChristmasTimeShopping {
    public boolean isChristmasGift;

    public abstract void selectItem();

    public abstract void makeOrderPayment();

    public final void useChristmasPackaging() {
        if (isChristmasGift == true) {
            System.out.println("Christmas gift is packed in festive packaging.");
        } else {
            System.out.println("Regular packaging is made.");
        }
    }

    public final void addChristmasDiscount() {
        System.out.println("Christmas discount for the next order is included.");
    }

    public final void workOnOrder() {
        selectItem();
        makeOrderPayment();
        addChristmasDiscount();
        useChristmasPackaging();
    }

    public void setChristmasGift(boolean christmasGift) {
        isChristmasGift = christmasGift;
    }

    public boolean isChristmasGift() {
        return isChristmasGift;
    }
}
