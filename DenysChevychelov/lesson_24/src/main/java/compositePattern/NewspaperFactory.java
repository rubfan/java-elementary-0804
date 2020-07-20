package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class NewspaperFactory {
    private List<Writer> writers = new ArrayList<Writer>();

    public void addWriter(Writer writer) {
        writers.add(writer);
    }

    public void removeWriter(Writer writer) {
        writers.remove(writer);
    }

    public void createNewspaper() {
        System.out.println("Factory creates newspaper...\n ");

        for (Writer writers : writers) {
            writers.writeArticle();
        }
    }
}
