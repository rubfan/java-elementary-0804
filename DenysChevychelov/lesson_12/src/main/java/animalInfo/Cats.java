package animalInfo;

public class Cats extends Carnivora {
    private String groupName;
    protected boolean canGrowl;

    protected Cats() {
        this.groupName = "Family - Cats.";
        this.haveNightVision = true;
    }

    protected String howLegs() {
        return "Have 4 legs.";
    }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {
        String mainInfo = super.getInfo()
                + "Have retractile claws, slender muscular bodies and strong flexible forelimbs.\n";
        return mainInfo;
    }
}
