package factoryMethod;

public class ExcelReport implements ReportCreator {
    private Report report;

    public ExcelReport(String type) {
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
        return "ExcelReport{" +
                "report=" + report +
                '}';
    }
}
