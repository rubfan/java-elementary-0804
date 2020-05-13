import java.util.Scanner;

public class Printer {
    public PrinterProperties properties = new PrinterProperties();
    public PrintingTime time = new PrintingTime();

    public static void main(String[] args) {
        Printer epsonPrinter = new Printer();
        epsonPrinter.properties.setName("EPSON PHOTO JET");
        epsonPrinter.properties.setSeriesNumber("SN 1234567R");
        epsonPrinter.properties.setPrinterType("Jet");
        epsonPrinter.time.setSpeedPrint((short) 1);

        printPrinter(epsonPrinter);
    }

    private static void printPrinter(Printer printer) {
        System.out.println("Printer: " + printer.properties.getName());
        System.out.println("Serial number: " + printer.properties.getSeriesNumber());
        System.out.println("Printer type: " + printer.properties.getPrinterType());
        System.out.println("Enter the number of pages to find out the print time: ");
        Scanner scanner = new Scanner(System.in);
        short numberOfPages = scanner.nextShort();
        printer.time.printTime(numberOfPages);
    }
}
