package animalInfo;

public class Carnivora extends Mammals {
    private String groupName;
    protected boolean haveNightVision;

    protected Carnivora() {
        this.groupName = "Order - Carnivora.";
    }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {

        String mainInfo = super.getInfo()
                + "Eat other animals.\n";
        return mainInfo;
    }
}
