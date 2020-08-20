package Lesson_21;

public class LiskovSubstitution {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setWheels(4);
        System.out.println(v1.showMove());


        FlyCarpet v2 = new FlyCarpet();
        v2.setHasWheels(false);
        System.out.println(v2.showMove());

        Vehicle v3 = new FlyCarpet();
        v3.setWheels(0);
        System.out.println(v3.showMove());

        FlyCarpet v4 = new FlyCarpet();
        v4.setHasWheels(true);
        v4.setWheels(2);
        System.out.println(v4.showMove());
    }
}

class Vehicle {
    int wheels;

    String showMove() {
        return "You can move on your " + getWheels() + " wheels";
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

}

class FlyCarpet extends Vehicle {
    boolean isHasWheels;

    public void setHasWheels(boolean hasWheels) {
        isHasWheels = hasWheels;
    }

    @Override
    String showMove() {
        if (!isHasWheels) {
            return "You can move without wheels";
        } else {
            return super.showMove();
        }
    }
}
