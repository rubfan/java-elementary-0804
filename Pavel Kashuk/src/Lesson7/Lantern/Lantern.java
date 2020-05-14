package Lesson7.Lantern;
/*
1) Создайте класс и определите методы для предмета "Фонарь".
У него будет название, определенное количество батареек, которые можно вставить,
он должен уметь светить красным, белым светом, а также мигать, причем для белого света достаточно одной батарейки,
для красного нужно 2, для мигающего нужно 3 (свойство int battery, которое будет хранить количество батареек для этого подойдет).
Вы можете добавить возможности фонаря, как сочтете нужным.
 */

public class Lantern {
    private String name;
    private int batteries;
    private String[] light;
    private int state;
    private int batteryCompartment;

    public Lantern() {
        name = "New Lantern";
        batteryCompartment = 3;
        batteries = 1;
        state = 0;
        light = new String[] {"off", "shines white", "shines red", "blinks"};
    }

    private boolean checkState(int state) {
        return state <= batteries;
    }

    public void setOff() {
        state = 0;
    }

     public void setShinesWhite() {
        int state = 1;
        if (checkState(state)) {
            this.state = state;
        } else {
            System.out.println("The Lantern can't shine white. Not enough batteries!");
        }
    }

    public void setShinesRed() {
        int state = 2;
        if (checkState(state)) {
            this.state = state;
        } else {
            System.out.println("The Lantern can't shine red. Not enough batteries!");
        }
    }

    public void setBLinks() {
        int state = 3;
        if (checkState(state)) {
            this.state = state;
        } else {
            System.out.println("The Lantern can't blinks. Not enough batteries!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void insertBattery() {
        if (batteries + 1 > batteryCompartment) {
            System.out.println("The battery compartment is full!");
        } else {
            batteries++;
        }
    }

    public void removeBattery() {
        if (batteries - 1 < 0) {
            System.out.println("The battery compartment is empty!");
        } else {
            batteries--;
        }
    }

    public int getBatteries() {
        return batteries;
    }

    public void printStateLantern() {
        System.out.println(name + " is " + light[state] + ".");
    }
}
