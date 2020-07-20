package prototype;

public class RoundWindow extends Window {
    private int radius;

    public RoundWindow() {
    }

    public RoundWindow(RoundWindow roundWindow) {
        super(roundWindow);
        if (roundWindow != null) {
            this.radius = roundWindow.radius;
        }
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Window clone() {
        return new RoundWindow(this);
    }
}
