package decoratorPattern;

public class DecoratorClient {
    public static void main(String[] args) {
        ReportSender reportSender = new SmsConfirmSender(
                                         new EmailReportDuplicator(
                                                new PaperReport()));

        System.out.println(reportSender.sendReport());
    }
}
