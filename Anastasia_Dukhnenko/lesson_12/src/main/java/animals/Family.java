package animals;

public class Family extends Infraclass {
    private String family;

    protected Family() {
        this.family = "Kangaroo";
    }
    public String getInfo() {
        String info = family + " family.\n";
        return super.getInfo() + info;
    }
}
