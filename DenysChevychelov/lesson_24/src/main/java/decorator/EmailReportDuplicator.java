package decorator;

public class EmailReportDuplicator extends ReportDecorator{
    public EmailReportDuplicator(ReportSender reportSender) {
        super(reportSender);
    }

    public String sendEmail() {
        return "Duplicate of report sent on email... ";
    }

    @Override
    public String sendReport() {
        return super.sendReport() + sendEmail();
    }
}
