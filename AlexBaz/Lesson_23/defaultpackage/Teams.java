package defaultpackage;

import factory.Competition;

public class Teams implements Competition {
    private String activity = "Teams play soccer on the field";

    public String getActivity() {
        return activity;
    }
}
