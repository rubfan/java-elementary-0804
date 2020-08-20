package memento;

public class DataPlayer {
    private Memento undo;
    private String dateOfBirth;
    private String fullName;
    private String currentClub;
    private String cityOfResidence;

    public DataPlayer(String dateOfBirth, String fullName, String currentClub, String cityOfResidence) {
        this.dateOfBirth = dateOfBirth;
        this.fullName = fullName;
        this.currentClub = currentClub;
        this.cityOfResidence = cityOfResidence;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCurrentClub() {
        return currentClub;
    }

    public void setCurrentClub(String currentClub) {
        this.currentClub = currentClub;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }

    private class Memento {
        String city;
        String club;

        public Memento() {
            this.city = cityOfResidence;
            this.club = currentClub;
        }

        public String getCity() {
            return city;
        }

        public String getClub() {
            return club;
        }
    }

    public void preview() {
        undo = new Memento();
    }

    public void undoChanges() {
        cityOfResidence = undo.getCity();
        currentClub = undo.getClub();
    }

    @Override
    public String toString() {
        return "DataPlayer{" +
                "dateOfBirth='" + dateOfBirth + '\'' +
                ", fullName='" + fullName + '\'' +
                ", currentClub='" + currentClub + '\'' +
                ", cityOfResidence='" + cityOfResidence + '\'' +
                '}';
    }
}

class RentOfPlayer {
    DataPlayer player;

    public RentOfPlayer(DataPlayer player) {
        this.player = player;
    }

    public DataPlayer rent(String newCityOfResidence, String newCurrentClub) {
        player.preview();
        player.setCityOfResidence(newCityOfResidence);
        player.setCurrentClub(newCurrentClub);
        return player;
    }

    public DataPlayer endOfRent() {
        player.undoChanges();
        return player;
    }
}

class Client {
    public static void main(String[] args) {
        DataPlayer player = new DataPlayer("13.03.89", "Oleg Shevchenko", "Dinamo", "Kiev");
        RentOfPlayer rent = new RentOfPlayer(player);
        System.out.println(player.toString());

        rent.rent("Dnepr", "Dnepr-1");
        System.out.println(player.toString());

        rent.endOfRent();
        System.out.println(player.toString());
    }
}
