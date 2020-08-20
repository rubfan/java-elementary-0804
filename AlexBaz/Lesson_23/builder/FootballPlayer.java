package builder;

public class FootballPlayer {
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private String currentClub;
    private String previousClub;
    private int memberOfTheUkrainianNationalTeamGames;

    public static class Builder {
        private FootballPlayer newPlayer;

        public Builder() {
            newPlayer = new FootballPlayer();
        }

        public Builder withName(String name){
            newPlayer.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newPlayer.surname = surname;
            return this;
        }

        public Builder withAge(int age){
            newPlayer.age = age;
            return this;
        }

        public Builder withHeight(int height){
            newPlayer.height = height;
            return this;
        }

        public Builder withWeight(int weight){
            newPlayer.weight = weight;
            return this;
        }

        public Builder withPreviousClub(String previousClub){
            newPlayer.previousClub = previousClub;
            return this;
        }

        public Builder withCurrentClub(String currentClub){
            newPlayer.currentClub = currentClub;
            return this;
        }

        public Builder withMemberOfTheUkrainianNationalTeamGames(int memberOfTheUkrainianNationalTeamGames){
            newPlayer.memberOfTheUkrainianNationalTeamGames = memberOfTheUkrainianNationalTeamGames;
            return this;
        }

        public FootballPlayer build(){
            return newPlayer;
        }
    }

    @Override
    public String toString() {
        return "FootballPlayer: " +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", height = " + height +
                ", weight = " + weight +
                ", currentClub = '" + currentClub + '\'' +
                ", previousClub = '" + previousClub + '\'' +
                ", memberOfTheUkrainianNationalTeamGames = " + memberOfTheUkrainianNationalTeamGames +
                '.';
    }
}
