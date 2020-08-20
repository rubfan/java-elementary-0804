package mediator;

public class Client {
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

    public void makeOrder() {
        System.out.println("Client ordered: ");
    }

    public void giveFeedback() {
        System.out.println("Everything was great,thanks!!!\n");
    }
}
