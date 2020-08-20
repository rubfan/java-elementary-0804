package facade;

public class CarBodyPainter {
    private boolean finishedPainting;

    public boolean isFinishedPainting() {
        return finishedPainting;
    }

    public void startPaint() {
        System.out.println("Painting in progress...");
        this.finishedPainting = false;
    }

    public void finishPaint() {
        System.out.println("Painting is finished.");
        this.finishedPainting = true;
    }
}
