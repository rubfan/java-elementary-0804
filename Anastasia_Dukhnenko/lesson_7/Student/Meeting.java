public class Meeting {
    private String l;
    private String c;
    private String b;
    public void go(String location, String company) {
        l = location;
        c = company;
        System.out.println("Я иду " + location + " c " + company + ".");
    }
    public void drink(String bottle, String company) {
        b = bottle;
        c = company;
        System.out.println("Я пью " + bottle + " c " + company + ".");
    }
}
