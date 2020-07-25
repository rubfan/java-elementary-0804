package solidPrinciples.singleResponsibilityPrinciple;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImplementation(),
                new DataManagerImplementation());
        phone.dial("012345");
        phone.send("massage text");
        phone.receive();
        phone.disconnect();
    }
}
