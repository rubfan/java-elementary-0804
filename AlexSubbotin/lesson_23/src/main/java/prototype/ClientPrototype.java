package prototype;

public class ClientPrototype {

    public static void main(String[] args) {
        RectangularWindow first = new RectangularWindow();
        first.setHeight(10);
        first.setWidth(20);
        RectangularWindow second = (RectangularWindow) first.clone();
        Window window = first.clone();
        window.setColour("Black");

        System.out.println(first);
        System.out.println(second);
        System.out.println(window);
    }
}
