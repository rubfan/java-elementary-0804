package proxy.virtualProxy;

public class Client {
    public static void main(String[] args) {
        Page google = new ProxyPage("google.com");
        Page twitter = new ProxyPage("twitter.com");

        google.displayPage();
        twitter.displayPage();

        google.displayPage();
        twitter.displayPage();
    }
}
