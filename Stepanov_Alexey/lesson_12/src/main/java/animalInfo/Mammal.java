package animalInfo;

public abstract class Mammal extends Animal {
    private String subKingdomName;
    private String territory;

    public Mammal(String kingdomName, String name, int livePeriod, String subKingdomName, String territory) {
        super(kingdomName, name, livePeriod);
        this.subKingdomName = subKingdomName;
        this.territory = territory;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Mammal";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nSub kingdom mame: " + this.subKingdomName +
                    "\nTerritory of living: " + this.territory;
        }
        return super.getInfo(true);
    }
}