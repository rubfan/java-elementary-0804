package Lamp;

public class Batteries {
    private int batteries;
    private boolean isWorking;

    public void setBatteries(int batteries) {
         this.batteries = batteries;
    }
    public void showSetBattery() {
            switch (batteries) {
                case 3:
                    System.out.println("Свечу белым");
                case 2:
                    System.out.println("Свечу красным");
                case 1:
                    System.out.println("Мигаю");
                    isWorking = true;
                    break;
                default:
                    System.out.println("Ошибка! Проверьте батарейки.");
                    isWorking = false;
            }
    }

    public void showIsWorking() {
        if (isWorking) {
            System.out.println("Рабочий");
        } else {
            System.out.println("Нерабочий");
        }
    }
}
