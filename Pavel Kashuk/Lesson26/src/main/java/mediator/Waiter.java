package mediator;

import java.util.ArrayList;
import java.util.List;

public class Waiter implements Mediator {
    private List<Action> actions = new ArrayList<>();

    @Override
    public void transferFrom(Action sender) {
        for (Action action : actions) {
            if (action.equals(sender)) {
                sender.createOrder();
                System.out.println("Order from: " + sender.getOrder().getId());
            }
        }
    }

    @Override
    public void addAction(Action action, Order order) {
        action.setOrder(order);
        this.actions.add(action);
    }
}
