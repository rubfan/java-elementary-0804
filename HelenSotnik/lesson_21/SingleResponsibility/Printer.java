package singleresponsibility;

public class Printer {
    private Document document;

    public Printer(Document document) {
        this.document = document;
    }

    public String printDocument() {
        return document.getText();
    }

    public String printDocumentInfo() {
        return "Author: " + document.getAuthor() + "\n" +
                "Document name: " + document.getName();
    }
}

