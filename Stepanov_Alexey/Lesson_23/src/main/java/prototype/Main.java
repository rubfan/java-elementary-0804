package prototype;

public class Main {
    public static void main(String[] args) {
        Restaurant forCopy = new Restaurant("Center", 15, false);
        Restaurant copyTo = forCopy.copy();
    }
}
