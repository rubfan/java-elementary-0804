package chainOfResponsibility;

public class PushNotifySender extends ReportSender {
    public PushNotifySender(int priority) {
        super(priority);
    }

    @Override
    public void write(String reportText) {
        System.out.println("Sending push notify report: " + reportText);
    }
}
