package chainOfResponsibility;

public abstract class ReportSender {
    private int priority;
    private ReportSender nextReportSender;

    public ReportSender(int priority) {
        this.priority = priority;
    }

    public void setNextReportSender(ReportSender nextReportSender) {
        this.nextReportSender = nextReportSender;
    }

    public void sendReport(String reportText, int priorityLevel) {
        if (priorityLevel >= this.priority) {
            write(reportText);
        }
        if (this.nextReportSender != null) {
            this.nextReportSender.sendReport(reportText, priorityLevel);
        }
    }

    public abstract void write(String reportText);
}
