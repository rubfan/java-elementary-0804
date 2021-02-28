package state;

public class Developer {

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (this.activity instanceof Sleeping) {
            setActivity(new Training());
        } else if (this.activity instanceof Training) {
            setActivity(new Coding());
        } else if (this.activity instanceof Coding) {
            setActivity(new Reading());
        } else if (this.activity instanceof Reading) {
            setActivity(new Sleeping());
        }
    }

    public void doAction() {
        this.activity.doAction();
    }
}
