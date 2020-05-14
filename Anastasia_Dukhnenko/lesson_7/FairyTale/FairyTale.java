public class FairyTale {
    Wolf wolf = new Wolf();
    Little_Red_Riding_Hood little_red_riding_hood = new Little_Red_Riding_Hood();
    Woodcutter woodcutter = new Woodcutter();
    Granny granny = new Granny();
    public static void main(String[] args) {
        FairyTale fairyTale = new FairyTale();
        fairyTale.little_red_riding_hood.carryPies(10);
        fairyTale.granny.knit("шарф");
        fairyTale.granny.letIn("волка");
        fairyTale.wolf.eat("бабушку");
        fairyTale.wolf.pretend("бабушкой");
        fairyTale.little_red_riding_hood.knockOnTheDoor();
        fairyTale.wolf.eat("Красную Шапочку");
        fairyTale.woodcutter.save("бабушку и Красную Шапочку");
        fairyTale.wolf.run("дровосека");
    }
}
