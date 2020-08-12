package chain;

abstract class ProcessFlow {
    private ProcessFlow processFlow;

    public ProcessFlow(ProcessFlow processFlow) {
        this.processFlow = processFlow;
    }

    public void process(Password password) {
        if (processFlow != null)
            processFlow.process(password);
    }
}