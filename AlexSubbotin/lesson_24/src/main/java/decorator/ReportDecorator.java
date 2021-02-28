package decorator;

public class ReportDecorator implements ReportSender {

    private ReportSender reportSender;

    public ReportDecorator(ReportSender reportSender) {
        this.reportSender = reportSender;
    }

    public String sendReport() {
        return this.reportSender.sendReport();
    }
}
