package factorym;

public class FactoryMethodClient {
    public static void main(String[] args) {
        ReportCreator rc = new PDFReport("PDF");
        rc.getType();
        rc = new ExcelReport("EXCEL");
        rc.getType();
    }
}
