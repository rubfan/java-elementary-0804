public class Wolf {
    private String f;
    private String h;
    private String s;
    public void eat(String food) {
        f = food;
        System.out.println("Волк ест " + food + ".");
    }
    public void run(String human) {
        h = human;
        System.out.println("Волк убегает от " + human + ".");
    }
    public void pretend(String someone) {
        s = someone;
        System.out.println("Волк притворяется " + someone + ".");
    }
}
