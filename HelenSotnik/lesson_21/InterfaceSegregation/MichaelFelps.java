package segregation;

public class MichaelFelps implements OlympicSwimmer {
    @Override
    public String showInfo() {
        return "Michael Felps represents USA\n" +
                "23fold Olympic Gold Champion\n" +
                "Sport nickname: Baltimore Bullet,Flying Fish\n";
    }

    @Override
    public String compete() {
        return "Michael Felps started competing\n";
    }

    @Override
    public String swimButterfly() {
        return "Michael Felps is swimming Butterfly style\n";
    }

    @Override
    public String swimBreaststroke() {
        return "Michael Felps is swimming Breaststroke style\n";
    }

    @Override
    public String swimCrawl() {
        return "Michael Felps is swimming Crawl style\n";
    }
}
