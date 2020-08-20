package animals;

public class Lion extends Mammal {

    @Override
    public String getInfo() {
        return super.getInfo() + "\nLion is a King of savannah.";
    }

    @Override
    protected String showHierarсhy() {
        return super.showHierarсhy() + " <= Lion";
    }

    @Override
    protected String showDescription() {
        setLionParameters();
        return super.showDescription();
    }

    protected void setLionParameters() {
        setDefenceMethod("Lives in pride, protects each other.");
        setFood("Eats wild boars, deer, wildebeests, zebras, buffalos and giraffes, hunts in a group.");
        setHabitat("In Africa and Asia in hot tropical climate.");
        setMovement("Speed of lion run reaches 80 km/h.");
        setVoice("Loud roar.");
        setLimbs("Has strong 4 limbs.");
    }
}
