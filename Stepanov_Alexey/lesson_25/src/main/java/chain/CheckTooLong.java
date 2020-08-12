package chain;

public class CheckTooLong extends ProcessFlow {
    public CheckTooLong(ProcessFlow processFlow) {
        super(processFlow);
    }

    public void process(Password password) {
        if (password.getPassword().length() > 10) {
            System.out.println("This password too long: " + password.getPassword());
        } else {
            super.process(password);
        }
    }
}