package animals;

public class Class extends Animal {
    private String сlass;

    protected Class() {
        this.сlass = "Mammals";
    }

    public String getInfo() {
        String info = сlass + " class.\n";
        return super.getInfo() + info;
    }
}
