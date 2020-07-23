package memento;

public class MementoClient {
    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument();
        LocalRepo localRepo = new LocalRepo();
        textDocument.setCreatorAndVersion("Denys", "1.0");
        localRepo.setSaver(textDocument.save());
        System.out.println(textDocument);

        textDocument.setCreatorAndVersion("Denys", "1.1");
        System.out.println(textDocument);

        textDocument.restore(localRepo.getSaver());
        System.out.println(textDocument);
    }
}
