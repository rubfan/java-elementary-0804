package animalInfo;

public class Caracals extends SmallCats {
    private String groupName;

    protected Caracals() {
        this.groupName = "Genus - Caracals.";
        this.wildCat = true;
    }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {
        String mainInfo = super.getInfo()
                + "Is a medium-sized wild cat.\n";
        return mainInfo;
    }
}
