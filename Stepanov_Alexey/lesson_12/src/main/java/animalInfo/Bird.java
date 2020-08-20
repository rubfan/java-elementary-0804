package animalInfo;

public class Bird extends Animal {
    String subKingdomName;

    public Bird(String kingdomName, String name, int livePeriod, String subKingdomName) {
        super(kingdomName, name, livePeriod);
        this.subKingdomName = subKingdomName;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Bird";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nSub kingdom: " + this.subKingdomName;
        }
        return super.getInfo(true);
    }
}
