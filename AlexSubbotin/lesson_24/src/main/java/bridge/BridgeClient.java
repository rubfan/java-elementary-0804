package bridge;

public class BridgeClient {
    public static void main(String[] args) {

    Press[] press = {new SportMagazine(new MagazineWriter()),
            new Newspaper(new NewspaperWriter())};
        for (Press pr : press) {
        pr.createArticles();
    }
        System.out.println("====================================");
    Press[] press2 = {new SportMagazine(new NewspaperWriter()),
            new Newspaper(new MagazineWriter())};
        for (Press pr : press2) {
        pr.createArticles();
    }
}
}
