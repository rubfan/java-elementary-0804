public class Dog extends Pets {

    private String groupName;
    protected boolean ableToBark;

    protected Dog() {
        this.groupName = "Subspecies - Dog.";
        this.ableToBark = true;
        this.haveASharpScent = true;
    }

    protected String getShortHierarchy() {
        return super.getShortHierarchy() + " <= Dog";
    }

    public String getGroupName() {
        return super.getGroupName() + this.groupName + "\n";
    }

    public String getInfo() {
        return super.getInfo() +
                "Dog is a good friend for human and smart animal.\n" +
                "Able to bark - " + this.ableToBark + "\n" +
                "Have a sharp scent - " + this.haveASharpScent + "\n";
    }
}
