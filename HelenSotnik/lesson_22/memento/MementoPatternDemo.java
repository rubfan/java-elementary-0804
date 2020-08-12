package memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("Breakfast time");
        Memento memento = originator.createMemento();
        caretaker.addMemento(memento);

        originator.setState("Lunch time");
        memento = originator.createMemento();
        caretaker.addMemento(memento);

        originator.setState("Dinner time");
        memento = originator.createMemento();
        caretaker.addMemento(memento);

        originator.setState("Supper time");
        memento = originator.createMemento();
        caretaker.addMemento(memento);
        System.out.println("Current meal state: " + originator.getState());

        memento = caretaker.getMemento(2);
        originator.setMemento(memento);
        System.out.println("Previous saved meal state: " + originator.getState());

        memento = caretaker.getMemento(1);
        originator.setMemento(memento);
        System.out.println("Previous saved meal state: " + originator.getState());

        memento = caretaker.getMemento(0);
        originator.setMemento(memento);
        System.out.println("Previous saved meal state: " + originator.getState());
    }
}
