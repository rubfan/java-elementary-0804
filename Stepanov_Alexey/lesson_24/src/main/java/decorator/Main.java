package decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW X5");
        System.out.println(car.details());

        car = new Conditioner(car);
        System.out.println(car.details());

        car = new Leather(car);
        System.out.println(car.details());
    }
}
/* output
BMW X5
BMW X5: with conditioner
BMW X5: with conditioner: with leather sits
 */