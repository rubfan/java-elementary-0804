package flyweight;

import java.util.ArrayList;
import java.util.List;

public class PlaceLeaves {
    private List<Leaves> leavesList = new ArrayList<Leaves>();

    public void place(int coordinateX, int coordinateY, String id, String colour, String variant) {
        LeaveType type = LeavesFactory.getType(id, colour, variant);
        Leaves leaves = new Leaves(coordinateX, coordinateY, type);
        leavesList.add(leaves);
    }

    public int getSize() {
        return leavesList.size();
    }
}
