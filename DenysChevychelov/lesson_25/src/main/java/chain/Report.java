package chain;

public class Report extends ReportSender {
    public Report(int priority) {
        super(priority);
    }

    @Override
    public void write(String reportText) {
        System.out.println("Sending using simply paper report: " + reportText);
    }
}
