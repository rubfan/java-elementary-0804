package animalInfo;

public class Settled extends Flying {
    String territory;

    public Settled(String kingdomName, String name, int livePeriod, String subKingdomName, int flyingHeight, String territory) {
        super(kingdomName, name, livePeriod, subKingdomName, flyingHeight);
        this.territory = territory;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Settled";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nTerritory of living: " + this.territory;
        }
        return super.getInfo(true);
    }
}
