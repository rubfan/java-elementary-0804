package chainOfResponsibility;

public class ChainOfResponsibilityClient {
    public static void main(String[] args) {
        ReportSender reportSender = new Report(1);//1 - not important level, use only paper report;
        ReportSender emailReport = new EmailReport(2);//2 - important level, use paper report and email report;
        ReportSender pushReport = new PushNotifySender(3);//3 - very important level, use all kinds of reports.

        reportSender.setNextReportSender(emailReport);
        emailReport.setNextReportSender(pushReport);

        System.out.println("======Not important level======");
        reportSender.sendReport("Bla ...", 1);
        System.out.println("======Important level======");
        reportSender.sendReport("Bla, bla ...", 2);
        System.out.println("======Very important level======");
        reportSender.sendReport("Bla, bla,bla ...", 3);
    }
}
