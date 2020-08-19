package observer;

public class ObserverClient {
    public static void main(String[] args) {
        ReportSystem reportSystem = new ReportSystem();

        reportSystem.addChanges("First change");

        Observer employee1 = new Employee("Employee 1");
        Observer employee2 = new Employee("Employee 2");
        reportSystem.addObserver(employee1);
        reportSystem.addObserver(employee2);

        reportSystem.addChanges("Second change");
        reportSystem.addChanges("Third change");
    }
}
