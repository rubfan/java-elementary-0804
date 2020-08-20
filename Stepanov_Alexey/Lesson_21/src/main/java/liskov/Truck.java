package liskov;

public class Truck implements Car {
    private int consumption;
    private int maxCapacity;
    private double averageSpeed;

    public Truck(int consumption, int maxCapacity, double averageSpeed) {
        this.consumption = consumption;
        this.maxCapacity = maxCapacity;
        this.averageSpeed = averageSpeed;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public double efficiency(int distance, int units) {
        return distance * this.consumption / capacityCheck(units) / 100;
    }

    public double costPerUnit(double fuelPrice) {
        double fuelPerUnit = efficiency(1000, 25);
        return fuelPerUnit * fuelPrice * adjustment();
    }

    private double adjustment() {
        return 1 + this.averageSpeed / 500;
    }

    private int capacityCheck(int units) {
        if (units < 5) {
            units = 5;
        } else if (units > this.maxCapacity) {
            units = 33;
        }
        return units;
    }
}
