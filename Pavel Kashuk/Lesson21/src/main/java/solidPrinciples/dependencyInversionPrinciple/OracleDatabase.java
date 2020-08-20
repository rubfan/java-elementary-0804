package solidPrinciples.dependencyInversionPrinciple;

public class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connection to Oracle database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting Oracle database...");
    }
}
