public class Labrador extends Retrievers {
    private final String isBreed = "Labrador";


    protected String temperament() {
        return "With a good character, very agile. Hyperactive, if you deal with it correctly.";
    }

    protected String toWeight() {
        return "Gaining excess weight with improper feeding.";
    }

    protected String huntingDog() {
        return "Excellent flair, soft grip (soft mouth), a good and passionate hunter.";
    }

    @Override
    public String getInfo() {
        Labrador lb = new Labrador();
        String info = lb.getHeterotrophs() + "\n" +
                lb.feedWithMilk() + "\n" +
                lb.getFoot() + "\n" +
                lb.getTail() + "\n" +
                lb.eatingMeat() + "\n" +
                lb.train() + "\n" +
                lb.character() + "\n" +
                lb.huntingDog() + "\n" +
                lb.temperament() + "\n" +
                lb.toWeight() + "\n" +
                lb.setBreed(isBreed);
        return info;
    }
}
