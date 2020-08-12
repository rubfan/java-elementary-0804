package chainof.responsibility;

public class SpamChain implements EmailProcessingChain {
    private EmailProcessingChain nextChain;
    private SpamBox spamBox;

    public SpamChain(SpamBox spamBox) {
        this.spamBox = spamBox;
    }

    public SpamBox getSpamBox() {
        return spamBox;
    }

    public void setSpamBox(SpamBox spamBox) {
        this.spamBox = spamBox;
    }

    public EmailProcessingChain getNextChain() {
        return nextChain;
    }

    @Override
    public void setNextChain(EmailProcessingChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handleRequest(String emailText) throws NullPointerException {
        if (emailText.contains("advertising")) {
            this.spamBox.takeRequest();
        } else if (nextChain != null) {
            nextChain.handleRequest(emailText);
        } else {
            throw new NullPointerException("Problem with the text,send email once again");
        }
    }
}
