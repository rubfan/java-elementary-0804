package composite;

public class AmericasBeveragesSubdivision implements PepsiCoSubdivision {
    private String name;
    private String regionOfResponsibility;

    public AmericasBeveragesSubdivision(String name, String regionOfResponsibility) {
        this.name = name;
        this.regionOfResponsibility = regionOfResponsibility;
    }

    public void showSubdivisionName() {
        System.out.println(getName() + " is responsible for " + getRegionOfResponsibility());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionOfResponsibility() {
        return regionOfResponsibility;
    }

    public void setRegionOfResponsibility(String regionOfResponsibility) {
        this.regionOfResponsibility = regionOfResponsibility;
    }
}
