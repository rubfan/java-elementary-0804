public class Cat extends Pets {

    private String groupName;
    protected boolean ableToPurr;

    protected Cat() {
        this.groupName = "Subspecies - Cat.";
        this.ableToPurr = true;
        this.haveNightVision = true;
    }

    protected String getShortHierarchy() {
        return super.getShortHierarchy() + " <= Cat";
    }

    public String getGroupName() {
        return super.getGroupName() + this.groupName + "\n";
    }

    public String getInfo() {
        return super.getInfo() +
                "Cat is a good rodent hunter and other small animals.\n" +
                "Able to purr - " + this.ableToPurr + "\n" +
                "Have a night vision - " + this.haveNightVision + "\n";
    }
}
