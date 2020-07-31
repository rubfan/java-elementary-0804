public class TaskSix {
    public static void main(String[] args) {

        double sum = Double.parseDouble(args[0]);
        String serviceLvl = args[1];
        double tips = 0;

        if (serviceLvl.equals("terrible")) {
            tips = 0;
        }

        if (serviceLvl.equals("poor")) {
            tips = sum / 100 * 5;
        }

        if (serviceLvl.equals("good")) {
            tips = sum / 100 * 10;
        }

        if (serviceLvl.equals("great")) {
            tips = sum / 100 * 15;
        }

        if (serviceLvl.equals("excellent")) {
            tips = sum / 100 * 20;
        }

        System.out.println("Tips = " + tips);
    }
}
