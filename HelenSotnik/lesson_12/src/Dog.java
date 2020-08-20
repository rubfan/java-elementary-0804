package animals;

public class Dog extends Pet {
    private String appointment;

    @Override
    public String getInfo() {
        return super.getInfo() + "\nDog is a best man's friend, it guards and entertains his owner.";
    }

    @Override
    protected String showHierarсhy() {
        return super.showHierarсhy() + " <= Dog";
    }

    @Override
    protected String showDescription() {
        return super.showDescription() + "\n" + getAppointment();
    }

    protected String getAppointment() {
        return appointment;
    }

    protected void setAppointment(String appointment) {
        this.appointment = appointment;
    }
}
