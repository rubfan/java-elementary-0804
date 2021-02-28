package prototype;

public abstract class Window {

    private String colour;

    public Window() {
    }

    public Window(Window window) {
        if (window != null) {
            this.colour = window.colour;
        }
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract Window clone();
}
