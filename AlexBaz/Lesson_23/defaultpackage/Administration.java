package defaultpackage;

import factory.Competition;

public class Administration implements Competition {
    private String activity =  "Administration organizes a match";

    public String getActivity() {
        return activity;
    }
}
