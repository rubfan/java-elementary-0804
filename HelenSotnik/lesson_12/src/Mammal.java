package animals;

public class Mammal extends WildAnimal {
    private String limbs;

    @Override
    public String getInfo() {
        return super.getInfo() + "\nMammals has wool, are warm-blooded and feed the young with milk.";
    }

    @Override
    protected String showHierarсhy() {
        return super.showHierarсhy() + " <= Mammal";
    }

    @Override
    protected String showDescription() {
        return super.showDescription() + "\n" + getLimbs();
    }

    protected String getLimbs() {
        return limbs;
    }

    protected void setLimbs(String limbs) {
        this.limbs = limbs;
    }
}
