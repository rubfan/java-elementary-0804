package animalInfo;

public class BigCats extends Cats {
    private String groupName;


    protected BigCats() {
        this.groupName = "Subfamily - Big Cats.";
        this.canGrowl = true;
    }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {
       String mainInfo = super.getInfo()
               + "Include the largest representatives. Can growl.\n";
        return mainInfo;
    }
}
