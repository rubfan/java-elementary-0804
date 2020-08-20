package prototype;

public class SpaceShip implements Prototype {
    private String name;
    private Integer crew;
    private Double fuel;
    private Alien captain;

    public SpaceShip(String name, Integer crew, Double fuel, Alien captain) {
        this.name = name;
        this.crew = crew;
        this.fuel = fuel;
        this.captain = captain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCrew() {
        return crew;
    }

    public void setCrew(Integer crew) {
        this.crew = crew;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public Alien getCaptain() {
        return captain;
    }

    public void setCaptain(Alien captain) {
        this.captain = captain;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", crew=" + crew +
                ", fuel=" + fuel +
                ", captain=" + captain +
                ", ref=" + hashCode() +
                '}';
    }

    @Override
    public Prototype createClone() {
        return new SpaceShip(this.name, this.crew, this.fuel, (Alien) this.captain.createClone());
    }
}
