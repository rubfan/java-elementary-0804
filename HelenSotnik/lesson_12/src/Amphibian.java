package animals;

public class Amphibian extends WildAnimal {
    private String breeding;

    @Override
    public String getInfo() {
        return super.getInfo() + "\nAmphibian live in the water and land, are cold-blooded.";
    }

    @Override
    protected String showHierarсhy() {
        return super.showHierarсhy() + " <= Amphibian";
    }

    @Override
    protected String showDescription() {
        return super.showDescription() + "\n" + getBreeding();
    }

    protected String getBreeding() {
        return breeding;
    }

    protected void setBreeding(String breeding) {
        this.breeding = breeding;
    }
}
