package solidPrinciples.singleResponsibilityPrinciple;

public class Phone implements ConnectionManagerInterface, DataManagerInterface {
    private ConnectionManagerInterface connection;
    private DataManagerInterface dataChannel;

    public Phone(ConnectionManagerInterface connection, DataManagerInterface dataChannel) {
        this.connection = connection;
        this.dataChannel = dataChannel;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connection.disconnect();
    }

    @Override
    public void send(String message) {
        dataChannel.send(message);
    }

    @Override
    public int receive() {
        return dataChannel.receive();
    }
}
