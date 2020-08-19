package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<EventListener>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> security = listeners.get(eventType);
        security.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> security = listeners.get(eventType);
        security.remove(listener);
    }

    public void notify(String eventType) {
        List<EventListener> security = listeners.get(eventType);
        for (EventListener listener : security) {
            listener.update(eventType);
        }
    }
}
