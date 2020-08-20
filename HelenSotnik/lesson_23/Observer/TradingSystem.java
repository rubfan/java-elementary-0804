package observer;

import java.util.ArrayList;
import java.util.List;

public class TradingSystem {
    private String news;
    private List<StockExchangeDB> databases = new ArrayList<>();

    public void addObserver(StockExchangeDB database) {
        this.databases.add(database);
    }

    public void removeObserver(StockExchangeDB database) {
        this.databases.remove(database);
    }

    public void setNews(String news) {
        this.news = news;
        for (StockExchangeDB database : this.databases) {
            database.update(this.news);
        }
    }
}
