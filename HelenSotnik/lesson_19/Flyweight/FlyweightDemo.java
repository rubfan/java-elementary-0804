package flyweight;

import java.util.HashMap;

public class FlyweightDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            SamsungCase samsungCase = (SamsungCase) PhoneCaseFactory.getSamsungCase(getRandomColor());
            samsungCase.produce();
        }
    }

    public static String getRandomColor() {
        String[] colors = {"LightBlue", "Transparent", "Yellow", "White", "Red", "Grey", "Purple", "Black"};
        return colors[(int) (Math.random() * colors.length)];
    }
}

