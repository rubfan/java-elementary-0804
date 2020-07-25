package solidPrinciples.singleResponsibilityPrinciple;

public interface DataManagerInterface {
    void send(String message);

    int receive();
}
