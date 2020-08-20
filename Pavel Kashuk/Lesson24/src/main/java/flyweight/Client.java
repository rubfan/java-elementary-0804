package flyweight;

public class Client {
    private static final String[] colors = {"Red", "Orange", "Blue", "Yellow", "Pink"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            AngryBird angryBird = (AngryBird) BirdFactory.getAngryBird(getRandomColor());
            angryBird.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int) (Math.random()*colors.length)];
    }
}
