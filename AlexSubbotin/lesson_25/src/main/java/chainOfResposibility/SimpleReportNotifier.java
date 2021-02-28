package chainOfResposibility;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    public void write(String massage) {
        System.out.println("Notifying using simple report: " + massage);
    }
}
