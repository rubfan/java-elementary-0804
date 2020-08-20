package AnimalPackage;

public class Animals extends AnimalInfo {
    private String move;
    private String food;

    protected String getMove() {
        return move;
    }

    protected String getFood() {
        return food;
    }

    protected void setMove(String move) {
        this.move = move;
    }

    protected void setFood(String food) {
        this.food = food;
    }

    public String getInfo() {
        return "Animals are living organisms that live in the environment" + "\n";
    }

    public String getAnimalHierarchy() {
        return "Animals, ";
    }
}
