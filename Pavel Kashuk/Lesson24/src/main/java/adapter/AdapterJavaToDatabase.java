package adapter;

public class AdapterJavaToDatabase implements Database {
    private JavaApplication javaApplication;

    public AdapterJavaToDatabase(JavaApplication javaApplication) {
        this.javaApplication = javaApplication;
    }

    public void insert() {
        this.javaApplication.saveObject();
    }

    public void update() {
        this.javaApplication.updateObject();
    }

    public void select() {
        this.javaApplication.loadObject();
    }

    public void remove() {
        this.javaApplication.deleteObject();
    }
}
