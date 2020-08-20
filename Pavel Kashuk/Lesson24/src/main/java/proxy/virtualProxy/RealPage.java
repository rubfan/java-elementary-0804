package proxy.virtualProxy;

public class RealPage implements Page {
    private String url;

    public RealPage(String url) {
        this.url = url;
        downloadPage();
    }

    private void downloadPage() {
        System.out.printf("Downloading page '%s'%n", url);
    }

    public void displayPage() {
        System.out.printf("Displaying page '%s'%n", url);
    }
}
