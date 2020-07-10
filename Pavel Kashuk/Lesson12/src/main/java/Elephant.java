public class Elephant extends WildAnimals {

    private String groupName;

    protected Elephant(String elephantName) {
        this.name = elephantName;
        this.groupName = "Kind - Elephant.";
        this.isHerbivorous = true;
    }

    public String getName() {
        return name;
    }

    protected String getShortHierarchy() {
        return super.getShortHierarchy() + " <= Elephant";
    }

    public String getGroupName() {
        return super.getGroupName() + this.groupName + "\n";
    }

    public String getInfo() {
        return "Name - " + getName() + "\n" +
                this.groupName + "\n" +
                super.getInfo() +
                "Elephants are the largest animals on the Earth.\n" +
                "Animal is herbivorous - " + this.isHerbivorous + "\n";
    }
}
