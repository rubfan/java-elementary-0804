public class Mode {
    public static int SelectMode;
    public static BatteryCase battery = new BatteryCase();
    public static LedColor ledcolor = new LedColor();
    public static void Selected() {
        switch (SelectMode) {
            //режим: постоянно светитится белым, необходимо любое количество батареек
            case 0: {
                System.out.println("Color: " + ledcolor.color[0] + "; Mode lighting: const");
            }
            break;
            //режим: постоянно светитится красным, необходимо более 2 батарейки
            case 1: {
                if (battery.batteryQlty == 1) System.out.println("not enough battaries");
                if (battery.batteryQlty >= 2)
                    System.out.println("Color: " + ledcolor.color[1] + "; Mode lighting: const");
            }
            break;
            //режим: мигает белым,необходимо 3 батарейки
            case 2: {
                if (battery.batteryQlty < 3) System.out.println("not enough battaries");
                else System.out.println("Color: " + ledcolor.color[0] + "; Mode lighting: var");
            }
            break;
            //режим: мигает красным,необходимо 3 батарейки
            case 3: {
                if (battery.batteryQlty <3) System.out.println("not enough battaries");
                else System.out.println("Color: " + ledcolor.color[1] + "; Mode lighting: const");
            }
            break;
            case 4: {
                if (battery.batteryQlty <3) System.out.println("not enough battaries");
                else System.out.println("Beeeeep");
            }
        }
    }
}


