package observer;

public class Client {
    public static void main(String[] args) {
        DeveloperJobSite jobSite = new DeveloperJobSite();

        jobSite.addVacancy("First java position");
        jobSite.addVacancy("Second java position");

        Observer firstSubscriber = new Subscriber("Bob");
        Observer secondSubscriber = new Subscriber("Tom");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third java position");

        jobSite.removeVacancy("First java position");
    }
}
