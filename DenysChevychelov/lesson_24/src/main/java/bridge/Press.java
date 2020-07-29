package bridge;

public abstract class Press {
    protected Writer writer;

    public Press(Writer writer) {
        this.writer = writer;
    }

    public abstract void createArticles();
}
