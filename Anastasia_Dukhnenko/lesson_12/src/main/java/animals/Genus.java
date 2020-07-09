package animals;

public class Genus extends Family{
    protected String genus;
    private String color;
    private int length;
    private float weight;

    protected Genus() {
        this.genus = "Striped kangaroo";
        this.color = "Grey";
        this.length = 45;
        this.weight = 1.5f;
    }

    public String getInfo() {
        String info = genus + " genus.\n";
        String info2 = color + " color.\n";
        String info3 = length + " cm of length.\n";
        String info4 = weight + " kg of weight.";
        return super.getInfo() + info
                + info2 + info3 + info4;
    }
}
