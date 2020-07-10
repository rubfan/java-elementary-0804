public class Lion extends WildAnimals {

    private String groupName;
    protected boolean ableToGrowl;

    protected Lion(String lionName) {
        this.name = lionName;
        this.groupName = "Kind - Lion.";
        this.isPredatory = true;
        this.ableToGrowl = true;
    }

    public String getName() {
        return name;
    }

    protected String getShortHierarchy() {
        return super.getShortHierarchy() + " <= Lion";
    }

    public String getGroupName() {
        return super.getGroupName() + this.groupName + "\n";
    }

    public String getInfo() {
        return "Name - " + getName() + "\n" +
                this.groupName + "\n" +
                super.getInfo() +
                "Lion has a mane and one of the largest living cats family.\n" +
                "Animal is predatory - " + this.isPredatory + "\n" +
                "Able to growl - " + this.ableToGrowl + "\n";
    }
}
