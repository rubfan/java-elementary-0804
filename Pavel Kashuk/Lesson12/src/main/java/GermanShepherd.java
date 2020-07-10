public class GermanShepherd extends Dog {

    private String groupName;

    public GermanShepherd(String dogName) {
        this.name = dogName;
        this.groupName = "Breed - German Shepherd.";
    }

    public String getName() {
        return name;
    }

    protected String getShortHierarchy() {
        return super.getShortHierarchy() + " <= German Shepherd";
    }

    public String getGroupName() {
        return super.getGroupName() + this.groupName + "\n";
    }

    public String getInfo() {
        return "Name - " + getName() + "\n" +
                this.groupName + "\n" +
                super.getInfo() +
                "German Shepherd is well for the family and to guard.\n";
    }
}
