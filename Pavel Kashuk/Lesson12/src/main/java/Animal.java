public class Animal extends AnimalInfo {

    protected String name;
    private String groupName;

    public String getName() {
        return name;
    }

    protected Animal() {
        this.groupName = "Kingdom - Animal.";
    }

    protected String getShortHierarchy() {
        return "Animal";
    }

    public String getGroupName() {
        return this.groupName + "\n";
    }

    public String getInfo() {
        return "Animal can move,eat,sleep and make sound.\n";
    }
}
