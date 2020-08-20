package animals;

public class Beagle extends Dog {

    @Override
    public String getInfo() {
        return super.getInfo() + "\nA greed of a dog is beagle, which means its a medium size hunting dog.";
    }

    @Override
    protected String showHierarсhy() {
        return super.showHierarсhy() + " <= Beagle";
    }

    @Override
    protected String showDescription() {
        setBeagleParameters();
        return super.showDescription();
    }

    protected void setBeagleParameters() {
        setPetNickname("Pet nickname is Herda.");
        setVoice("Dog's voice is Woof-Woof.");
        setHabitat("Lives in temperate climate,in aviary or inside owner home.");
        setOwnerName("Owner name is Helen.");
        setMovement("Dog prefers to run.");
        setFood("Favorite food is meat and bones.");
        setAppointment("Hunting dog has a strong scent, run fast and has good reaction.");
    }
}
