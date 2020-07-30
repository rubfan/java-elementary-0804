package prototype;

public class Alien implements Prototype {
    private String name;
    private Double height;
    private Double weight;

    public Alien(String name, Double height, Double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", ref=" + hashCode() +
                '}';
    }

    @Override
    public Prototype createClone() {
        return new Alien(this.name, this.height, this.weight);
    }
}
