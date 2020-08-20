package composite;

import java.util.ArrayList;

public class Directory implements Actions {
    private String name;
    private ArrayList<Actions> files = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Actions file) {
        files.add(file);
    }

    public void remove(Actions file) {
        files.remove(file);
    }

    public void showContent() {
        for (Actions file : files) {
            System.out.print(name + " : ");
            file.showContent();
        }
    }
}
