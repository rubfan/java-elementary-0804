package bridge;

import bridge.cars.*;
import bridge.modifications.*;

public class Main {
    public static void main(String[] args) {
        //comfort sets
        Standard standard = new Standard("Basic", "White");
        Luxury luxury = new Luxury("Top", "Metallic", true);
        Pure pure = new Pure("Basic", "Black", true);

        //cars combined with comfort levels
        AllWheelsDrive bmwX5Lux = new AllWheelsDrive(luxury, "BMW", "X5", 19);
        FrontWheelsDrive nissanBasic = new FrontWheelsDrive(standard, "Nissan", "Micro");
        FrontWheelsDrive nissanPure = new FrontWheelsDrive(pure, "Nissan", "Micro");
    }
}
