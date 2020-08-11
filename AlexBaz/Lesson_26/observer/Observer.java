package observer;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        HillelCanal hillelCanal = new HillelCanal();
        Subscriber s1 = new Subscriber("AlexBaz");
        Subscriber s2 = new Subscriber("chevyden");
        Subscriber s3 = new Subscriber("HelenSotnik");
        Subscriber s4 = new Subscriber("PavelKashuk");

        hillelCanal.addObserver(s1);
        hillelCanal.addObserver(s2);
        hillelCanal.addObserver(s3);
        hillelCanal.addObserver(s4);
        hillelCanal.newVideo("KV (08.04.2020) Java Elementary (02.08.2020)",
                "https://www.youtube.com/watch?v=2A1t426cmR8&feature=emb_title");
    }
}

abstract class Observer {
    String canalName;

    public Observer(String canalName) {
        this.canalName = canalName;
    }

    public void handleEvent(String promo, String url) {
    }
}

interface YouTubeCanal {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}

class HillelCanal implements YouTubeCanal {
    String promo;
    String url;

    List<Observer> subscribers = new ArrayList<Observer>();

    public void newVideo(String promo, String url) {
        this.promo = promo;
        this.url = url;
        notifyObserver();
    }

    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer o : subscribers) {
            o.handleEvent(promo, url);
        }
    }
}

class Subscriber extends Observer {
    public Subscriber(String canalName) {
        super(canalName);
    }

    public void handleEvent(String promo, String url) {
        System.out.println("New video released: " + promo + "\n" + "To view follow the link: " + url);
    }
}
