package singleton;

public class FederationFootballUkrainian {
    private static FederationFootballUkrainian instance;
    private String presidentFederation;

    public FederationFootballUkrainian(String presidentFederation) {
        this.presidentFederation = presidentFederation;
    }

    public static FederationFootballUkrainian getInstance(String presidentFederation) {
        if (instance == null) {
            instance = new FederationFootballUkrainian(presidentFederation);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "FederationFootballUkrainian. " +
                "President Federation - " + presidentFederation;
    }
}
