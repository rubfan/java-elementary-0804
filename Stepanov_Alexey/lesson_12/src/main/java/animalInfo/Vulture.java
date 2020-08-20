package animalInfo;

public class Vulture extends Scavenger {
    int flyingHeight;

    public Vulture(String kingdomName, String name, int livePeriod, String subKingdomName, String territory, int groupPopulation, String type, int flyingHeight) {
        super(kingdomName, name, livePeriod, subKingdomName, territory, groupPopulation, type);
        this.flyingHeight = flyingHeight;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Vulture";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nFlying height: " + this.flyingHeight;
        }
        return super.getInfo(true);
    }
}
