package animalInfo;

public class Mammals extends Animal {
    private String groupName;

    protected Mammals() {
        this.groupName = "Class - Mammals.";
    }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {

        String mainInfo = super.getInfo()
                + "Produce milk for feeding their young\n";
        return mainInfo;
    }
}
