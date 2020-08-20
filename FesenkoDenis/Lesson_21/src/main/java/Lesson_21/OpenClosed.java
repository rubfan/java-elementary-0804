package Lesson_21;

public class OpenClosed {
    public static void main(String[] args) {
        TechnoDog dog = new TechnoDogUpdated(false);
        System.out.println(dog.dance());
        TechnoDog dog1 = new TechnoDogUpdated(true);
        System.out.println(dog1.dance());
    }
}

 class TechnoDog {
    int length;
    String name;

    public TechnoDog() {
    }

    String dance() {
        return "Dance on the flor";
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class TechnoDogUpdated extends TechnoDog {
    boolean isFlyable;
    boolean wings;

    public TechnoDogUpdated(boolean isFlyable) {
        this.isFlyable = isFlyable;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }

    @Override
    String dance() {
        if (isFlyable) {
            setWings(true);
            return "Dance in the sky";
        } else {
            setWings(false);
            return super.dance();
        }
    }
}
