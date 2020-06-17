package animalInfo;

public class DomesticCats extends ForestCats {
    private String groupName;

    protected DomesticCats() {
        this.groupName = "Species - Domestic Cats.";
        this.wildCat = false;
    }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {
        String mainInfo = super.getInfo()
                + howLegs() + "\n"
                + "Lives near people.\n"
                + "This animal have night vision - " + this.haveNightVision + "\n"
                + "This animal can growl - " + this.canGrowl + "\n"
                + "This animal wild - " + this.wildCat + "\n";
        return mainInfo;
    }
}
