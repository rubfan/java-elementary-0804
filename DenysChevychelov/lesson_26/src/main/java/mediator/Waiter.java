package mediator;

import java.util.ArrayList;
import java.util.List;

public class Waiter implements Mediator {
    private List<Participant> participants = new ArrayList<Participant>();


    public void addParticipant(Participant participant, Order order) {
        participant.setOrder(order);
        this.participants.add(participant);
    }

    public void transferFrom(Participant sender) {
        for (Participant participant : participants) {
            if (participant.equals(sender)) {
                sender.createOrder();
                System.out.println("Order id: " + sender.getOrder().getId());
            }
        }
    }
}
