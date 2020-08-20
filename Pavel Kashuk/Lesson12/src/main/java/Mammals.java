public class Mammals extends Animal {

    private String groupName;

    protected Mammals() {
        this.groupName = "Class - Mammals.";
    }

    protected String getShortHierarchy() {
        return super.getShortHierarchy() + " <= Mammals";
    }

    public String getGroupName() {
        return super.getGroupName() + this.groupName + "\n";
    }

    public String getInfo() {
        return super.getInfo() +
                "Mammals feeds their young with milk.\n";
    }
}
