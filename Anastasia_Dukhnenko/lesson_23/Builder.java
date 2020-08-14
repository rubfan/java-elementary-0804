public class Builder {
    public static void main(String[] args) {
        Stylist stylist = new Stylist();
        LookBuilder cheapLookBuilder = new CheapLookBuilder();

        stylist.setLookBuilder(cheapLookBuilder);
        stylist.constructLook();
        Look look = stylist.getLook();
    }
}

class Look {
    private String skirt;
    private String tShirt;
    private String shoes;
    private String hat;

    public void getSkirt(String skirt) {
        this.skirt = skirt;
    }
    public void getTShirt(String tShirt) {
        this.tShirt = tShirt;
    }
    public void getShoes(String shoes) {
        this.shoes = shoes;
    }
    public void getHat(String hat) {
        this.hat = hat;
    }
}

abstract class LookBuilder {
    protected Look look;

    public Look getLook() {
        return look;
    }

    public void createNewLook() {
        look = new Look();
    }

    public abstract void putOnSkirt();
    public abstract void putOnTShirt();
    public abstract void putOnShoes();
    public abstract void putOnHat();
}

class CheapLookBuilder extends LookBuilder {
    public void putOnSkirt() {
        look.getSkirt("Bershka");
    }
    public void putOnTShirt() {
        look.getTShirt("H&M");
    }
    public void putOnShoes() {
        look.getShoes("Goldie");
    }
    public void putOnHat() {
        look.getHat("Asos");
    }
}

class Stylist {
    private LookBuilder lookBuilder;

    public void setLookBuilder(LookBuilder lookBuilder) {
        this.lookBuilder = lookBuilder;
    }

    public Look getLook() {
        return lookBuilder.getLook();
    }

    public void constructLook() {
        lookBuilder.createNewLook();
        lookBuilder.putOnSkirt();
        lookBuilder.putOnTShirt();
        lookBuilder.putOnShoes();
        lookBuilder.putOnHat();
    }
}
