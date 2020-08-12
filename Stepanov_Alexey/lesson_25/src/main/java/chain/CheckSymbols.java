package chain;

public class CheckSymbols extends ProcessFlow {
    public CheckSymbols(ProcessFlow processFlow) {
        super(processFlow);
    }

    public void process(Password password) {

        if (password.getPassword().indexOf("?") != -1) {
            System.out.println("This password has invalid symbol: " + password.getPassword());
        } else {
            super.process(password);
        }
    }
}
