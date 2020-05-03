public class Task7 {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int costPerDay = 40;
        int rentSum = days * costPerDay;
        if (days > 7) {
            rentSum = rentSum - 50;
        } else if (days > 5) {
            rentSum = rentSum - 20;
        }
        System.out.println("Rent cost equals " + rentSum + " hrn.");
    }
}
