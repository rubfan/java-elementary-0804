public class PrinterProperties {
    private String name;
    private String seriesNumber;
    private String type;

    public void setName(String PrinterName) {
        name = PrinterName;
    }

    public String getName() {
        return name;
    }

    public void setSeriesNumber(String printerSeriesNumber) {
        seriesNumber = printerSeriesNumber;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public void setPrinterType(String printerType) {
        type = printerType;
    }

    public String getPrinterType() {
        return type;
    }
}
