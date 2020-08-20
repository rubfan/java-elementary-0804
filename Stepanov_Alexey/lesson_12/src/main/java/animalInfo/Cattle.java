package animalInfo;

public abstract class Cattle extends Herbivore {
    private int weight;
    private String type;

    public Cattle(String kingdomName, String name, int livePeriod, String subKingdomName, String territory, String typeOfLiving, int weight, String type) {
        super(kingdomName, name, livePeriod, subKingdomName, territory, typeOfLiving);
        this.weight = weight;
        this.type = type;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Cattle";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nAverage weight " + this.weight +
                    "\nType of animal " + this.type;
        }
        return super.getInfo(true);
    }
}
