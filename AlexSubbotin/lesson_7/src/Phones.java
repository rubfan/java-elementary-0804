public class Phones {
    public static void main(String[] args) {
        PhonesProperties phone = new PhonesProperties();
        phone.setModel("Iphone 12 Pro");
        phone.setPrice(1000);
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
