package liskov;

public interface Car {
    double efficiency(int distance, int units);
    double costPerUnit(double fuelPrice);
}
