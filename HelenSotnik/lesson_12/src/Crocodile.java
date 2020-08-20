package animals;

public class Crocodile extends Reptile {

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    @Override
    protected String showHierarсhy() {
        return super.showHierarсhy() + " <= Crocodile";
    }

    @Override
    protected String showDescription() {
        setCrocodileParameters();
        return super.showDescription();
    }

    protected void setCrocodileParameters() {
        setDefenceMethod("Has powerful jaws with sharp teeth.");
        setFood("Eats any live animal which is able to eat, for example wildebeest.");
        setHabitat("Lives in tropic climate near fresh water.");
        setMovement("Swim good, and  move fast in the land.");
        setVoice("Usually very silent, but can make rumbling sound.");
        setSkin("Has scaly skin impervious to water.");
    }
}
