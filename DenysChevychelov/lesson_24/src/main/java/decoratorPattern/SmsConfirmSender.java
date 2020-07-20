package decoratorPattern;

public class SmsConfirmSender extends ReportDecorator {
    public SmsConfirmSender(ReportSender reportSender) {
        super(reportSender);
    }

    public String sendSmsConfirmation() {
        return "Confirmation from the sent report has been sent..";
    }

    @Override
    public String sendReport() {
        return super.sendReport() + sendSmsConfirmation();
    }
}
