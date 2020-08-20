public class Persian extends Cat {

    private String groupName;

    public Persian(String catName) {
        this.name = catName;
        this.groupName = "Breed - Persian.";
    }

    public String getName() {
        return name;
    }

    protected String getShortHierarchy() {
        return super.getShortHierarchy() + " <= Persian";
    }

    public String getGroupName() {
        return super.getGroupName() + this.groupName + "\n";
    }

    public String getInfo() {
        return "Name - " + getName() + "\n" +
                this.groupName + "\n" +
                super.getInfo() +
                "Persian has short legs and thick coat.\n";
    }
}
