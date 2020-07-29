package bridge;

public class Newspaper extends Press {
    public Newspaper(Writer writer) {
        super(writer);
    }

    public void createArticles() {
        System.out.println("Newspaper in progress...");
        writer.writeArticle();
    }
}
