package observer;

import java.util.List;

public interface Observer {
    void handleChanges(List<String> changes);
}
