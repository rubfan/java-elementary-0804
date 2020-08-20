package bridge;

public interface PositionOnTheField {
    void setPositionOnTheField();
}

class Defender implements PositionOnTheField {
    public void setPositionOnTheField() {
        System.out.println("Defender");
    }
}

class Midfielder implements PositionOnTheField {
    public void setPositionOnTheField() {
        System.out.println("Midfielder");
    }
}

class Lateral implements PositionOnTheField {
    public void setPositionOnTheField() {
        System.out.println("Lateral");
    }
}

class Forward implements PositionOnTheField {
    public void setPositionOnTheField() {
        System.out.println("Forward");
    }
}
