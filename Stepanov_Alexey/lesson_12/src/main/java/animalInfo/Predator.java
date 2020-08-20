package animalInfo;

public class Predator extends Mammal {
    int groupPopulation;

    public Predator(String kingdomName, String name, int livePeriod, String subKingdomName, String territory, int groupPopulation) {
        super(kingdomName, name, livePeriod, subKingdomName, territory);
        this.groupPopulation = groupPopulation;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Predator";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nGroup population: " + this.groupPopulation;
        }
        return super.getInfo(true);
    }
}
