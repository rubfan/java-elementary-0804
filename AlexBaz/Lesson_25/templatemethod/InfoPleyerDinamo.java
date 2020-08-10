package templatemethod;

abstract class InfoPlayerDinamo {
    void templateMethod() {
        System.out.print("Club Dinamo, ");
        System.out.print("position - " + position() + ", ");
        System.out.print("name - " + name() + ", ");
        System.out.println("city Kiev.");
    }

    protected abstract String position();

    protected abstract String name();
}

class DePena extends InfoPlayerDinamo {
    @Override
    protected String position() {
        return "left inside";
    }

    @Override
    protected String name() {
        return "Karlos";
    }
}

class Verbich extends InfoPlayerDinamo {
    @Override
    protected String position() {
        return "right inside";
    }

    @Override
    protected String name() {
        return "Benyamin";
    }
}

class Client {
    public static void main(String[] args) {
        InfoPlayerDinamo p1 = new DePena();
        InfoPlayerDinamo p2 = new Verbich();
        p1.templateMethod();
        p2.templateMethod();
    }
}
