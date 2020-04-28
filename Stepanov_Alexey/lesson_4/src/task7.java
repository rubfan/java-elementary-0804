public class task7 {
    public static void main(String[] args) {
            int people = Integer.parseInt(args[0]);
			int volumeToDrink = people * 100;            
            int bottles = volumeToDrink % 750 == 0 ? volumeToDrink / 750 : volumeToDrink / 750 + 1;
            System.out.println("Bottles: " + bottles);
            System.out.println("Leftover: " + (bottles * 750 - volumeToDrink) + "ml");
	}
}