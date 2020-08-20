package animalInfo;

public class Hunt extends Predator {
    int speed;
    int weight;

    public Hunt(String kingdomName, String name, int livePeriod, String subKingdomName, String territory, int groupPopulation, int speed, int weight) {
        super(kingdomName, name, livePeriod, subKingdomName, territory, groupPopulation);
        this.speed = speed;
        this.weight = weight;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Hunt";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nMoving speed: " + this.speed +
                    "\nAverage weight: " + this.weight;
        }
        return super.getInfo(true);
    }
}
