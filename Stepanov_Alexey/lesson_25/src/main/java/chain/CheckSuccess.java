package chain;

public class CheckSuccess extends ProcessFlow {
    public CheckSuccess(ProcessFlow processFlow) {
        super(processFlow);
    }

    public void process(Password password) {
        System.out.println("This password is ok: " + password.getPassword());
    }
}