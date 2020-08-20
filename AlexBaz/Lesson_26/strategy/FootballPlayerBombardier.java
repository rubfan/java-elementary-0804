package strategy;

public class FootballPlayerBombardier {
    private String fullName;
    private String club;
    private int goals;
    private int games;

    public FootballPlayerBombardier(String fullName, String club, int goals, int games) {
        this.fullName = fullName;
        this.club = club;
        this.goals = goals;
        this.games = games;
    }

    public String getFullName() {
        return fullName;
    }

    public String getClub() {
        return club;
    }

    public int getGoals() {
        return goals;
    }

    public int getGames() {
        return games;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setGames(int games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "FootballPlayerBombardier{" +
                "fullName='" + fullName + '\'' +
                ", club='" + club + '\'' +
                ", goals=" + goals +
                ", games=" + games +
                '}';
    }
}
