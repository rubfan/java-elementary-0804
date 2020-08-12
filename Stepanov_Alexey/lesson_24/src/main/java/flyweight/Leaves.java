package flyweight;

public class Leaves {
    private int coordinateX;
    private int coordinateY;
    private LeaveType leaveType;

    public Leaves(int coordinateX, int coordinateY, LeaveType leaveType) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.leaveType = leaveType;
    }
}
