package animalInfo;

public class Dogs extends Hunt {
    int height;
    int length;

    public Dogs(String kingdomName, String name, int livePeriod, String subKingdomName, String territory, int groupPopulation, int speed, int weight, int height, int length) {
        super(kingdomName, name, livePeriod, subKingdomName, territory, groupPopulation, speed, weight);
        this.height = height;
        this.length = length;

    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Dogs";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nHeight: " + this.height +
                    "\nLength: " + this.length;
        }
        return super.getInfo(true);
    }
}
