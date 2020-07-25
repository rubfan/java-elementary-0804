package solidPrinciples.singleResponsibilityPrinciple;

public class DataManagerImplementation implements DataManagerInterface {
    @Override
    public void send(String message) {
        System.out.println("data sent successfully");
    }

    @Override
    public int receive() {
        System.out.println("data receive successfully");
        return 0;
    }
}
