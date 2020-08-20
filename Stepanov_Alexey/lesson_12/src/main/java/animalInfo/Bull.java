package animalInfo;

public class Bull extends Cattle {
    private int meatKilos;
    private int growPeriod;

    public Bull(String kingdomName, String name, int livePeriod, String subKingdomName, String territory, String typeOfLiving, int weight, String type, int meatKilos, int growPeriod) {
        super(kingdomName, name, livePeriod, subKingdomName, territory, typeOfLiving, weight, type);
        this.meatKilos = meatKilos;
        this.growPeriod = growPeriod;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Bull";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nMeat production: " + this.meatKilos +
                    "\nGrowing period: " + this.growPeriod;
        }
        return super.getInfo(true);
    }
}
