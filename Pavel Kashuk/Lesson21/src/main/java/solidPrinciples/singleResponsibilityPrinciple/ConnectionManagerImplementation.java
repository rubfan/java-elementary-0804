package solidPrinciples.singleResponsibilityPrinciple;

public class ConnectionManagerImplementation implements ConnectionManagerInterface {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("connect established");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected successfully");
    }
}
