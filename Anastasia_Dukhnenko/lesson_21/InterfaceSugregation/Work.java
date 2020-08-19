package InterfaceSugregation;

interface Person {
    void breath();
    void eat();
    void sleep();
}

interface Teacher {
    void teach();
    void checkHomework();
}

interface Businessman {
    void negotiate();
    void invest();
}

class Monika implements Person, Teacher {

    @Override
    public void teach() {
        System.out.println("Teaching");
    }

    @Override
    public void checkHomework() {
        System.out.println("Checking homework");
    }

    @Override
    public void breath() {
        System.out.println("Breathing");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}
class Tom implements Person, Businessman {

    @Override
    public void negotiate() {
        System.out.println("Negotiating");
    }

    @Override
    public void invest() {
        System.out.println("Investing");
    }

    @Override
    public void breath() {
        System.out.println("Breathing");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}
