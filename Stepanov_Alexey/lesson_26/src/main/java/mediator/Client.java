package mediator;

public class Client implements User {
    private Mediator mediator;
    private String name;

    public Client(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void add(Order order) {
        order.setClient(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
