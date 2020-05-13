public class PrintingTime {
    private short speedPrint;

    public void printTime(short numberOfPages) {
        short printTime = (short) (numberOfPages * speedPrint);
        if (printTime < 60 && printTime > 0) {
            System.out.println("Printing time - " + printTime + " min.");
        } else if (printTime == 60) {
            System.out.println("Printing time - 1 hour.");
        } else if (printTime > 60) {
            short printTimeHours = (short) (printTime / 60);
            short printTimeMin = (short) (printTime % 60);
            System.out.println("Printing time - " + printTimeHours + " hours and " + printTimeMin + " minutes.");
        } else {
            System.out.println("Please, enter correct number of pages.");
        }
    }

    public short getSpeedPrint() {
        return speedPrint;
    }

    public void setSpeedPrint(short printerSpeedPrint) {
        speedPrint = printerSpeedPrint;
    }
}
