package chain;

public class CheckTooShort extends ProcessFlow {
    public CheckTooShort(ProcessFlow processFlow) {
        super(processFlow);
    }

    public void process(Password password
    ) {
        if (password.getPassword().length() < 5) {
            System.out.println("You password too short: " + password.getPassword());
        } else {
            super.process(password);
        }
    }
}
