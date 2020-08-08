package chainOfResponsibility;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    public void write(String massage) {
        System.out.println("Sending email: " + massage);
    }
}
