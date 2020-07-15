package animalInfo;

public abstract class Herbivore extends Mammal {
    private String typeOfLiving;

    public Herbivore(String kingdomName, String name, int livePeriod, String subKingdomName, String territory, String typeOfLiving) {
        super(kingdomName, name, livePeriod, subKingdomName, territory);
        this.typeOfLiving = typeOfLiving;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Herbivore";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nWay of living: " + this.typeOfLiving;
        }
        return super.getInfo(true);
    }
}
