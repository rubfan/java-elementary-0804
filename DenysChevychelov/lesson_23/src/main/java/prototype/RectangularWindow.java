package prototype;

public class RectangularWindow extends Window {
    private int width;
    private int height;

    public RectangularWindow() {
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public RectangularWindow(RectangularWindow rectangularWindow) {
        super(rectangularWindow);
        if (rectangularWindow != null) {
            this.width = rectangularWindow.width;
            this.height = rectangularWindow.height;
        }
    }

    @Override
    public Window clone() {
        return new RectangularWindow(this);
    }

    @Override
    public String toString() {
        return "RectangularWindow{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
