package Lesson7.phone;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setModel("Iphone 11 Pro");
        phone.setPrice(999.99);
        phone.showInfo();
        phone.checkPrice();
        phone.checkCategory();
        phone.makePhoto();
        phone.callSomeone();
        phone.goToInternet();
        phone.playGame();
        phone.showBattery();
        phone.setOff();
    }
}
