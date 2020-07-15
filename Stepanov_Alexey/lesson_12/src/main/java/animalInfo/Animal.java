package animalInfo;

abstract class Animal extends AnimalInfo{
    private String kingdomName;
    private String name;
    private int livePeriod;

    public Animal(String kingdomName, String name, int livePeriod) {
        this.kingdomName = kingdomName;
        this.name = name;
        this.livePeriod = livePeriod;
    }

    public String getHierarchy() {
        return "Animal";
    }

    public String getInfo(boolean nameOnly) {
        if (!nameOnly) {
            return  "Animal name: "  + this.name +
                    "\n-----Detailed information-----" +
                    "\nKingdom name: " + this.kingdomName +
                    "\nLife length: " + this.livePeriod;
        }
        return this.name;
    }
}
