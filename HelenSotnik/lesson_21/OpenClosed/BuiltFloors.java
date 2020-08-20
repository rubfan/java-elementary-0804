package openclosed;

public class BuiltFloors implements BuildingConstructionStage {
    private int totalFloors;
    private int builtFloors;

    public BuiltFloors(int totalFloors, int builtFloors) {
        this.totalFloors = totalFloors;
        this.builtFloors = builtFloors;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public int getBuiltFloors() {
        return builtFloors;
    }

    public void setBuiltFloors(int builtFloors) {
        this.builtFloors = builtFloors;
    }

    @Override
    public boolean showConstructionStage() {
        int getState = getTotalFloors() - getBuiltFloors();
        if (getState != 0) {
            return false;
        } else {
            return true;
        }
    }
}
