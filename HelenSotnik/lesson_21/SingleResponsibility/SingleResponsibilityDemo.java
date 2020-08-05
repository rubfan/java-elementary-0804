package singleresponsibility;

public class SingleResponsibilityDemo {

    public static void main(String[] args) {
        Document d = new Document();
        Printer printer = new Printer(d);

        d.setName("\"Sales and Purchase document\"");
        d.setText("This is a Sales and Purchase document,which states that..." + "\n" + "etc");
        d.setAuthor("Notary");

        System.out.println(printer.printDocumentInfo());
        System.out.println(printer.printDocument());
    }
}
