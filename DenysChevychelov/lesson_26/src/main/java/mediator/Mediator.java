package mediator;

public interface Mediator {
    void transferFrom(Participant sender);
    void addParticipant(Participant participant, Order order);
}
