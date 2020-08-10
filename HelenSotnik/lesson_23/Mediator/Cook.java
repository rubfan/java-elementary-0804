package mediator;

public class Cook {
    private CoffeeBarWaiter waiter;
    private MenuDish menuDish;

    public CoffeeBarWaiter getWaiter() {
        return waiter;
    }

    public void setWaiter(CoffeeBarWaiter waiter) {
        this.waiter = waiter;
    }

    public MenuDish getMenuDish() {
        return menuDish;
    }

    public void setMenuDish(MenuDish menuDish) {
        this.menuDish = menuDish;
    }

    public void cookOrder() {
        System.out.println("The order is passed to cook.\n" + "Cook started cooking...");
    }

    public void acceptFeedback() {
        System.out.println("Thanks for feedback)))\n");
    }
}
