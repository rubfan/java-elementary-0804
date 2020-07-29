package observer;

public interface ObservedChanges {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
