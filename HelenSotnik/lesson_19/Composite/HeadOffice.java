package composite;

import java.util.ArrayList;
import java.util.List;

public class HeadOffice implements PepsiCoSubdivision {
    private String name;
    private String regionOfResponsibility;
    private List<PepsiCoSubdivision> subdivisionList;

    public HeadOffice(String name, String regionOfResponsibility) {
        this.name = name;
        this.regionOfResponsibility = regionOfResponsibility;
        this.subdivisionList = new ArrayList<>();
    }

    public void showSubdivisionName() {
        subdivisionList.forEach(PepsiCoSubdivision::showSubdivisionName);
    }

    public void addSubdivision(PepsiCoSubdivision subdivision) {
        subdivisionList.add(subdivision);
    }

    public void removeSubdivision(PepsiCoSubdivision subdivision) {
        subdivisionList.remove(subdivision);
    }
}
