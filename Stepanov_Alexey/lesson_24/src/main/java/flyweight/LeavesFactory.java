package flyweight;

import java.util.HashMap;
import java.util.Map;

public class LeavesFactory {
    static Map<String, LeaveType> type = new HashMap<String, LeaveType>();

    public static LeaveType getType(String id, String colour, String variant) {
        LeaveType result = type.get(id);
        if (result == null) {
            result = new LeaveType(id, colour, variant);
            type.put(id, result);
        }
        return result;
    }
}
