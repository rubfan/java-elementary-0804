package Lesson7.phone;
/*
2) Придумайте еще 2 каких-нибудь объекта из реальной жизни и реализуйте это с помощью класса.
 */

public class Phone {
    private String model;
    private double price;
    private String category;
    private int batteryCharge;
    private boolean state;

    public Phone() {
        model = "New Phone";
        batteryCharge = 100;
        state = true;
        price = 0;
    }

    private boolean checkState(boolean state) {
        if (batteryCharge > 0) {
            System.out.println("Phone is on. Available " + batteryCharge + " %");
            return true;
        } else {
            System.out.println("Phone is off. Need charge!");
            return false;
        }
    }

    public void setOff() {
        state = false;
        System.out.println("Phone is off");
    }

    public void makePhoto() {
        if (checkState(state)) {
            System.out.println("Nice shot");
            spendCharge(10);
            System.out.println("Left " + batteryCharge + " %");
        }
        else {
            System.out.println("Phone is off. Need to charge");
        }
    }

    public void goToInternet() {
        if (checkState(state)) {
            System.out.println("What site are we going to?");
            spendCharge(20);
            System.out.println("Left " + batteryCharge + " %");
        }
        else {
            System.out.println("Phone is off. Need to charge");
        }
    }

    public void playGame() {
        if (checkState(state)) {
            System.out.println("Time to games");
            spendCharge(30);
            System.out.println("Left " + batteryCharge + " %");
        }
        else {
            System.out.println("Phone is off. Need to charge");
        }
    }

    public void callSomeone() {
        if (checkState(state)) {
            System.out.println("Who are we calling?");
            spendCharge(5);
            System.out.println("Left " + batteryCharge + " %");
        }
        else {
            System.out.println("Phone is off. Need to charge");
        }
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void spendCharge(int batteryCharge) {
        if (batteryCharge > 0) {
            this.batteryCharge -= batteryCharge;
        } else {
            System.out.println("Nothing to spend. Need charge!");
        }
    }

    public void chargeBattery(int batteryCharge) {
        if (batteryCharge < 100) {
            this.batteryCharge += batteryCharge;
        } else {
            System.out.println("Battery is full. Don't need to charge");
        }
    }

    public void showBattery() {
        System.out.println(model + " have " + batteryCharge + " % battery");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void checkPrice() {
        if (price < 100 && price > 0) {
            this.category = "Cheap";
            System.out.println("Your phone is simple");
        }
        else if (price < 500 && price > 100) {
            this.category = "Normal";
            System.out.println("Your phone is good");
        }
        else if (price < 1000 && price > 500 ) {
            this.category = "Premium";
            System.out.println("Your phone is amazing. Can you give me a call?");
        }
        else {
            System.out.println("We don’t have such expensive phones yet");
        }
    }

    public void checkCategory() {
        if (category.equals("Cheap")) {
            System.out.println("Your " + model + " from " + category + " segment");
        }
        if (category.equals("Normal")) {
            System.out.println("Your " + model + " from " + category + " segment");
        }
        if (category.equals("Premium")) {
            System.out.println("Your " + model + " from " + category + " segment");
        }
    }

    public void showInfo() {
        System.out.println("Model is " + model + ", price is " + price + " $");
    }
}
