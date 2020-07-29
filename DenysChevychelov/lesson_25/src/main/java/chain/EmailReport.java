package chain;

public class EmailReport extends ReportSender {
    public EmailReport(int priority) {
        super(priority);
    }

    @Override
    public void write(String reportText) {
        System.out.println("Sending report on email: " + reportText);
    }
}
