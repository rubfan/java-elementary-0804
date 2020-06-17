package animalInfo;

public class Animal extends AnimalInfo {
    protected String name;
    private String groupName;

    public String getName() {
        return name;
    }

    protected Animal() {
        this.groupName = "Kingdom - Animal.";
    }

    public String getGroupName() {
        String groupInfo = this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {
        String mainInfo = "Are able to move.\n";
        return mainInfo;
    }
}
