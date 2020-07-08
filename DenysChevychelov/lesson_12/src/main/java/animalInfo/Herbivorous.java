package animalInfo;

public class Herbivorous extends Mammals {
    private String groupName;

    protected Herbivorous() {
        this.groupName = "Order - Herbivorous.";
    }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {

        String mainInfo = super.getInfo()
                + "Eats plant foods.\n";
        return mainInfo;
    }
}
