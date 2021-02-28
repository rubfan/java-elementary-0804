package chainOfResposibility;

public class SMSNotifier extends Notifier {

    public SMSNotifier(int priority) {
        super(priority);
    }

    public void write(String massage) {
        System.out.println("Sending SMS to manager: " + massage);
    }
}
