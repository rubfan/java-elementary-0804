public class Main8 {
    public static void main(String[] args) {
        int ticketNumber = 100000;
        int luckyTicket = 0;
        do {
            if (ticketNumber / 100000 + (ticketNumber / 10000) % 10 + (ticketNumber / 1000) % 10 == (ticketNumber / 100) % 10 + (ticketNumber / 10) % 10 + ticketNumber % 10) {
                luckyTicket = luckyTicket + 1;
            }
            ticketNumber = ticketNumber + 1;
        } while (ticketNumber < 1000000);
        System.out.println(luckyTicket);
    }
}
