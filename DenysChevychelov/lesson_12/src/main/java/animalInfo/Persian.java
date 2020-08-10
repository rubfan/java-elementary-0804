package animalInfo;

public class Persian extends DomesticCats {
    private String groupName;

    public Persian(String catName) {
        this.name = catName;
        this.groupName = "Breed - Persian.";
    }

    public String getName() {
        return name;
    }

    public String getGroupName() {
        String groupInfo = super.getGroupName()
                + this.groupName;
        return groupInfo + "\n";
    }

    public String getInfo() {
        String mainInfo = getName() + "\n"
                + this.groupName + "\n"
                + super.getInfo()
                + "Has an extremely long and thick coat, short legs, "
                + "a wide head with the ears set far apart, large eyes.";
        return mainInfo;
    }
}