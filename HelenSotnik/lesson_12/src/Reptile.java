package animals;

public class Reptile extends WildAnimal {
    private String skin;

    @Override
    public String getInfo() {
        return super.getInfo() + "\nReptile are cold-blooded and carnivores animals.";
    }

    @Override
    protected String showHierarсhy() {
        return super.showHierarсhy() + " <= Reptile";
    }

    @Override
    protected String showDescription() {
        return super.showDescription() + "\n" + getSkin();
    }

    protected String getSkin() {
        return skin;
    }

    protected void setSkin(String skin) {
        this.skin = skin;
    }
}
