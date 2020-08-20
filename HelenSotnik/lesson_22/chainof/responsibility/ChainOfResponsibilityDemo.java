package chainof.responsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) throws NullPointerException {
        EmailProcessingChain problemSolvingChain = new ProblemSolvingChain(new ProblemSolvingService());
        EmailProcessingChain spamChain = new SpamChain(new SpamBox());
        EmailProcessingChain feedbackChain = new FeedbackChain(new FeedbackOperatingService());

        problemSolvingChain.setNextChain(problemSolvingChain);
        problemSolvingChain.handleRequest("help");

        problemSolvingChain.setNextChain(spamChain);
        problemSolvingChain.handleRequest("advertising");

        problemSolvingChain.setNextChain(feedbackChain);
        problemSolvingChain.handleRequest("complain");
    }
}
