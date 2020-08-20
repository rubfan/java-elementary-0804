package decorator;

public class Conditioner extends Additions {
    private Car car;

    public Conditioner(Car car) {
        this.car = car;
    }

    public String details() {
        return car.details() + ": with conditioner";
    }
}
