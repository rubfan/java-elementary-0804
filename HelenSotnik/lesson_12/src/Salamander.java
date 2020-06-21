package animals;

public class Salamander extends Amphibian {

    @Override
    public String getInfo() {
        return super.getInfo() + "\nSalamander is a tailed amphibian.";
    }

    @Override
    protected String showHierarсhy() {
        return super.showHierarсhy() + " <= Salamander";
    }

    @Override
    protected String showDescription() {
        setSalamanderParameters();
        return super.showDescription();
    }

    protected void setSalamanderParameters() {
        setFood("Eats insects.");
        setHabitat("Salamander lives in the water, sometimes in the land.");
        setMovement("In the water move with the help of tail, in the land with a help of two pairs of limbs.");
        setVoice("Makes sound like deaf loud squeak.");
        setDefenceMethod("Fire salamander secretes deadly poison from the skin.");
        setBreeding("Needs water for breeding.");
    }
}
