package flyweight;

import java.util.HashMap;

public class Flyweight {
    public static void main(String[] args) {
        FlyweightFactory ff = new FlyweightFactory();
        League[] leagues = {League.HEIGHT, League.FIRST, League.SECOND, League.AMATORY};

        for (League item : leagues) {
            Competition competition = ff.getCompetition(item);
            System.out.println("These competitions will require " + item.getValue() + " : \n" + competition.getActivity() + "\n");
        }
    }
}

class FlyweightFactory {
    private HashMap<League, Competition> state = new HashMap<League, Competition>();

    public Competition getCompetition(League league) {
        Competition competition = state.get(league);
        if (competition == null) {
            switch (league) {
                case HEIGHT:
                    competition = new Height();
                    break;

                case FIRST:
                    competition = new First();
                    break;

                case SECOND:
                    competition = new Second();
                    ;
                    break;

                case AMATORY:
                    competition = new Amatory();
                    break;
            }
            state.put(league, competition);
        }
        return competition;
    }
}

enum League {
    HEIGHT("Height"), FIRST("First"), SECOND("Second"), AMATORY("Amatory");
    private final String value;

    League(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
