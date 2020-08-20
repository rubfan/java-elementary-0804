package animalInfo;

public class Scavenger extends Predator {
    String type;

    public Scavenger(String kingdomName, String name, int livePeriod, String subKingdomName, String territory, int groupPopulation, String type) {
        super(kingdomName, name, livePeriod, subKingdomName, territory, groupPopulation);
        this.type = type;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Scavenger";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nAnimal type: " + this.type;
        }
        return super.getInfo(true);
    }
}
