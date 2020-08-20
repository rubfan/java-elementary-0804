package chain;

public class Process {
    ProcessFlow chain;

    public Process() {
        buildChain();
    }

    private void buildChain() {
        chain = new CheckSymbols(new CheckTooShort(new CheckTooLong(new CheckSuccess(null))));
    }

    public void process(Password password) {
        chain.process(password);
    }
}
