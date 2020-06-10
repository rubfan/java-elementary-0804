public class SteeringWheel {
    private String turnTo;

    public void sayBeep() {
        System.out.println("Beep!");
    }

    public void turn(String s) {
        turnTo = s;
        System.out.println("I go " + turnTo);
    }

   
}

