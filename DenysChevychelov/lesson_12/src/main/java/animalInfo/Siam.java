package animalInfo;

public class Siam extends DomesticCats {
    //    private String name;
    private String groupName;


    public Siam(String catName) {
        this.name = catName;
        this.groupName = "Breed - Siam.";
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
                + "Is characterized by blue almond-shaped eyes; "
                + "a triangular head shape; "
                + "large ears; "
                + "an elongated, slender, and muscular body; "
                + "and various forms of point colouration.";
        return mainInfo;
    }
}
