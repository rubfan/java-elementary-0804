package defaultpackage;

import factory.Competition;

public class Referee implements Competition {
    private String activity = "Referee judge the match";

    public String getActivity() {
        return activity;
    }
}
