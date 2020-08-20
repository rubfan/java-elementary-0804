package flyweight;

public interface Competition {
    public String getActivity();
}

class Height implements Competition {
    private String activity = "Administration organizes a match" + "\n" +
            "Media organize the broadcast" + "\n" +
            "Referee judge the match" + "\n" +
            "Teams play soccer on the field";

    public String getActivity() {
        return activity;
    }
}

class First implements Competition {
    private String activity = "Media organize the broadcast" + "\n" +
            "Referee judge the match" + "\n" +
            "Teams play soccer on the field";

    public String getActivity() {
        return activity;
    }
}

class Second implements Competition {
    private String activity = "Referee judge the match" + "\n" +
            "Teams play soccer on the field";

    public String getActivity() {
        return activity;
    }
}

class Amatory implements Competition {
    private String activity = "Teams play soccer on the field";

    public String getActivity() {
        return activity;
    }
}
