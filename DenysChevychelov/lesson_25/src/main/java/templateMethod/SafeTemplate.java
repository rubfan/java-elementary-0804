package templateMethod;

public abstract class SafeTemplate {
    public void operation() {
        System.out.println("Open safe...");
        middleOperation();
        System.out.println("Close safe...");
    }

    public abstract void middleOperation();
}
