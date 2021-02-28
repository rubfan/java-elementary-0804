package adapter;

public class PlugToSocketAdapter implements PlugAdapter{

    private TwoLeggedSocket twoLeggedSocket;

    public PlugToSocketAdapter(TwoLeggedSocket twoLeggedSocket) {
        this.twoLeggedSocket = twoLeggedSocket;
    }

    public void plugIntoSocket() {
        System.out.println("Isolate one leg for changed three legged plug into two legged plug");
        this.twoLeggedSocket.acceptTwoLeggedPlug();
    }
}
