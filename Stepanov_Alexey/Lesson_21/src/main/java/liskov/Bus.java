package liskov;

public class Bus implements Car {
    private int consumption;
    private int passengers;

    public Bus(int consumption, int passengers) {
        this.consumption = consumption;
        this.passengers = passengers;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double efficiency(int distance, int units) {
        return distance * this.consumption / units(units) / 100;
    }

    public double costPerUnit(double fuelPrice) {
        double fuelPerUnit = efficiency(1000, 20);
        return fuelPerUnit * fuelPrice;
    }

    private int units(int units) {
        return Math.min(units, this.passengers);
    }
}
