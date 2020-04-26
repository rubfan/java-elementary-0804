public class task7 {
    public static void main(String[] args) {
            double people = Double.parseDouble(args[0]);
            // +0.95 will do round up trick for this case
            int bottles = (int) (people / 7.5 + 0.95);
            System.out.println("Bottles: " + bottles);
            System.out.println("Leftover: " + (bottles * 7.5 - people) * 100 + "ml");
	}
}