public class Pets extends Mammals {

    private String groupName;
    protected boolean haveNightVision;
    protected boolean haveASharpScent;

    protected Pets() {
        this.groupName = "Category - Pets.";
    }

    protected String getShortHierarchy() {
        return super.getShortHierarchy() + " <= Pets";
    }

    public String getGroupName() {
        return super.getGroupName() + this.groupName + "\n";
    }

    public String getInfo() {
        return super.getInfo() +
                "Pets lives with people.\n";
    }
}
