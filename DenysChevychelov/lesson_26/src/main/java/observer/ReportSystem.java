package observer;

import java.util.ArrayList;
import java.util.List;

public class ReportSystem implements ObservedChanges {
    private List<String> changes = new ArrayList<String>();
    private List<Observer> employees = new ArrayList<Observer>();

    public void addChanges(String change) {
        this.changes.add(change);
        notifyObservers();
    }

    public void removeChanges(String change) {
        this.changes.remove(change);
        notifyObservers();
    }


    public void addObserver(Observer observer) {
        this.employees.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.employees.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : employees) {
            observer.handleChanges(this.changes);
        }
    }
}
