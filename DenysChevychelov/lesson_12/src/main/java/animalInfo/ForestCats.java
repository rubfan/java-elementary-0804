package animalInfo;

public class ForestCats extends SmallCats {
    private String groupName;


    protected ForestCats() {
        this.groupName = "Genus - Forest Cats.";
        this.wildCat = true;
    }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {
        String mainInfo = super.getInfo()
                + "Can hunt small rodents and other animals of a similar size.\n";
        return mainInfo;
    }
}
