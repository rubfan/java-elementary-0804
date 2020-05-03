public class Task8 {
    public static void main(String[] args) {

        int luckyTicket = 0;
        for (int ticketNumber = 100000; ticketNumber < 1_000_000; ticketNumber += 1) {
            if (ticketNumber / 100000 + (ticketNumber / 10000) % 10 + (ticketNumber / 1000) % 10 == (ticketNumber / 100) % 10 + (ticketNumber / 10) % 10 + ticketNumber % 10) {
                luckyTicket = luckyTicket + 1;
            }
        }
        System.out.println("Количество счастливых билетов в серии от 100000 до 999999" + " = " + luckyTicket);
    }

}
