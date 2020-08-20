package animalInfo;

public class Flying extends Bird {
    int flyingHeight;

    public Flying(String kingdomName, String name, int livePeriod, String subKingdomName, int flyingHeight) {
        super(kingdomName, name, livePeriod, subKingdomName);
        this.flyingHeight = flyingHeight;
    }

    public String getHierarchy() {
        return super.getHierarchy() + " <-- Flying";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return super.getInfo(false) +
                    "\nFlying height: " + this.flyingHeight;
        }
        return super.getInfo(true);
    }
}
