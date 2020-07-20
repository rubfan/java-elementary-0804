package decoratorPattern;

public class PaperReport implements ReportSender {
    public String sendReport() {
        return "Report on paper sent... ";
    }
}
