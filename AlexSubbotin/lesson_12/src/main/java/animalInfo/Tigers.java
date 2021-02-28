package animalInfo;

public class Tigers extends BigCats {

    private String groupName;

    protected Tigers () {
        this.groupName = "Genus - Tiger.";
    }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {
        String mainInfo = super.getInfo()
                + "Have dark vertical stripes on orange-brown fur with a lighter underside\n";
        return mainInfo;
    }
}
