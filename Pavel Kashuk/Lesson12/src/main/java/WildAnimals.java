public class WildAnimals extends Mammals {

    private String groupName;
    protected boolean isHerbivorous;
    protected boolean isPredatory;

    protected WildAnimals() {
        this.groupName = "Category - Wild animals.";
    }

    protected String getShortHierarchy() {
        return super.getShortHierarchy() + " <= Wild animals";
    }

    public String getGroupName() {
        return super.getGroupName() + this.groupName + "\n";
    }

    public String getInfo() {
        return super.getInfo() +
                "Wild animals whose natural habitat is wildlife.\n";
    }
}
