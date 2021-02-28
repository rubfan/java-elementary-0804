package mediator;

public interface Mediator {

    void transferFrom(Action sender);

    void addAction(Action action, Order order);
}
