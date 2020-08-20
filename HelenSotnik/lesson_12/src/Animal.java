package animals;

public class Animal extends AnimalInfo {
    private String food;
    private String movement;
    private String habitat;
    private String voice;

    @Override
    public String getInfo() {
        return "Is an animal. Has an ability to move, eat, sleep and reproduce.";
    }

    @Override
    protected String showHierarсhy() {
        return super.showHierarсhy() + " <= Animal";
    }

    protected String getFood() {
        return food;
    }

    protected void setFood(String f) {
        this.food = f;
    }

    protected String getMovement() {
        return movement;
    }

    protected void setMovement(String m) {
        this.movement = m;
    }

    protected String getHabitat() {
        return habitat;
    }

    protected void setHabitat(String h) {
        this.habitat = h;
    }

    protected String getVoice() {
        return voice;
    }

    protected void setVoice(String v) {
        this.voice = v;
    }

    protected String showDescription() {
        String description = getFood() + "\n" + getMovement() + "\n" + getHabitat() + "\n" + getVoice();
        return description;
    }
}