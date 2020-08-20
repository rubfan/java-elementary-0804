package defaultpackage;

public enum ClubName {
    DINAMO("Dinamo"), SHAHTAR("Shahtar"), ZORYA("Zorya"), KOLOS("Kolos"), OLEKSANDRIYA("Oleksandriya"), DESNA("Desna");
    private String name;

    ClubName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
