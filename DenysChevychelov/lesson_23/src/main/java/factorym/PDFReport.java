package factorym;

public class PDFReport implements ReportCreator {
    private Report report;

    public PDFReport(String type) {
        this.report = new Report(type);
    }

    public Report createReport() {
        return this.report;
    }

    public void getType() {
        System.out.println(this.report.getType());
    }

    @Override
    public String toString() {
        return "PDFReport{" +
                "report=" + report +
                '}';
    }
}
