package Task1;

public class Container {
    public User user;
    public Container nextContainer;

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Container getNextContainer() {
        return this.nextContainer;
    }

    public void setNextContainer(Container nextContainer) {
        this.nextContainer = nextContainer;
    }

    public Container() {
    }

    public Container(User user) {
        this.user = user;
    }
}

