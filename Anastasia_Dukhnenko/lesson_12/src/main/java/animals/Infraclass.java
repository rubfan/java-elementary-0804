package animals;

public class Infraclass extends Class{
    private String infraclass;

    protected Infraclass() {
        this.infraclass = "Marsupial";
    }

    public String getInfo() {
        String info  = infraclass + " infraclass.\n";
        return super.getInfo() + info;
    }
}
