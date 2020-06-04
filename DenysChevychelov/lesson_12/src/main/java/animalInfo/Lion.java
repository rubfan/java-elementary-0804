package animalInfo;

public class Lion extends BigCats {
    private String groupName;

    protected Lion() {
        this.groupName = "Genus - Lion.";
      }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {
        String mainInfo = super.getInfo()
                +"The largest member of the cats family.\n";
        return mainInfo;
    }
}
