package animalInfo;

public class SmallCats extends Cats {
    private String groupName;
    protected boolean wildCat;

    protected SmallCats() {
        this.groupName = "Subfamily - Small Cats.";
        this.canGrowl = false;
    }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {
        String mainInfo = super.getInfo()
                + "Are able to purr but not roar.\n";
        return mainInfo;
    }
}
