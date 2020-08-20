package chainof.responsibility;

public interface EmailProcessingChain {
    public void setNextChain(EmailProcessingChain nextChain);
    public void handleRequest(String emailText) throws NullPointerException;
}
