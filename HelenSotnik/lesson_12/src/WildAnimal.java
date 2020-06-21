package animals;

public class WildAnimal extends Animal {
    private String defenceMethod;

    @Override
    public String getInfo() {
        return super.getInfo() + "\nWild animals live in the wild, have to protect themselves and get food.";
    }

    @Override
    protected String showHierarсhy() {
        return super.showHierarсhy() + " <= WildAnimal";
    }

    @Override
    protected String showDescription() {
        return super.showDescription() + "\n" + getDefenceMethod();
    }

    protected String getDefenceMethod() {
        return defenceMethod;
    }

    protected void setDefenceMethod(String defenceMethod) {
        this.defenceMethod = defenceMethod;
    }
}
