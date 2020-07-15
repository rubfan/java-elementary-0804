package animalInfo;

public class Dove extends Settled {
    String breedingSeason;

    public Dove(String kingdomName, String name, int livePeriod, String subKingdomName, int flyingHeight, String territory, String breedingSeason) {
        super(kingdomName, name, livePeriod, subKingdomName, flyingHeight, territory);
        this.breedingSeason = breedingSeason;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Dove";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nBreeding season: " + this.breedingSeason;
        }
        return super.getInfo(true);
    }
}
