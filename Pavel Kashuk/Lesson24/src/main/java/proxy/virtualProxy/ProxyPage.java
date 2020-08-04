package proxy.virtualProxy;

public class ProxyPage implements Page {
    private RealPage realPage;
    private String url;

    public ProxyPage(String url) {
        this.url = url;
    }

    public void displayPage() {
        if (this.realPage == null) {
            this.realPage = new RealPage(url);
        }
        this.realPage.displayPage();
    }
}
