package mediator;

public class Cook implements User {
    private Mediator mediator;
    private String name;

    public Cook(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void add(Order order) {
        order.setCook(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
