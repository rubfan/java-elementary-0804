package task1;

public class Container {
    User user;
    Container nextContainer;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Container getNextContainer() {
        return nextContainer;
    }

    public void setNextContainer(Container nextContainer) {
        this.nextContainer = nextContainer;
    }

    public Container(User user) {
        this.user = user;
    }
}
