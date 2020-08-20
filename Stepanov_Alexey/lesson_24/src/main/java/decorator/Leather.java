package decorator;

public class Leather extends Additions {
    private Car car;

    public Leather(Car car) {
        this.car = car;
    }

    public String details() {
        return car.details() + ": with leather sits";
    }
}
