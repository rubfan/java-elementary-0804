package animalInfo;

public class Cats extends Hunt {
    int growthPeriod;

    public Cats(String kingdomName, String name, int livePeriod, String subKingdomName, String territory, int groupPopulation, int speed, int weight, int growthPeriod) {
        super(kingdomName, name, livePeriod, subKingdomName, territory, groupPopulation, speed, weight);
        this.growthPeriod = growthPeriod;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Cats";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nYears to grow: " + this.growthPeriod;
        }
        return super.getInfo(true);
    }
}
