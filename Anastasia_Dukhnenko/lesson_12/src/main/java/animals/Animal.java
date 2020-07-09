package animals;

public class Animal extends AnimalInfo {
    private boolean wildness;

    protected Animal() {
        this.wildness = true;
    }

    public String getInfo() {
        if (wildness == true) {
            return "It's wild.\n";
        } else {
            return "It's domestic.\n";
        }
    }
}
