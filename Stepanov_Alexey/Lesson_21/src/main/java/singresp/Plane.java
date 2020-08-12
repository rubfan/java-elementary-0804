package singresp;

public class Plane {
    private int speed;
    private int maxLoad;
    private String type;
    private int flyingHeight;
    private String model;
    private Pilot pilot;

    public Plane(int speed, int maxLoad, String type, int flyingHeight, String model, Pilot pilot) {
        this.speed = speed;
        this.maxLoad = maxLoad;
        this.type = type;
        this.flyingHeight = flyingHeight;
        this.model = model;
        this.pilot = pilot;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFlyingHeight() {
        return flyingHeight;
    }

    public void setFlyingHeight(int flyingHeight) {
        this.flyingHeight = flyingHeight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }
}
