package observer;

public class InteractiveBrokerDB implements StockExchangeDB {
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }
}
