package observer;

public class ObserverDemo {
    public static void main(String[] args) {
        TradingSystem observable = new TradingSystem();
        InteractiveBrokerDB observer = new InteractiveBrokerDB();

        observable.addObserver(observer);
        observable.setNews("The price of gold on the dollar depreciation background  reached $ 2,008 per troy ounce.");

        System.out.println(observer.getNews());
    }
}
