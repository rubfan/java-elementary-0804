package main.fueling;

public class Name {
    private String name;

    public void setName(String refuellerName) {
        name = refuellerName;
    }

    public void showName() {
        System.out.println("<<Aircraft refueller: " + name + ">>");
    }
}
