package HW11Task1;

public class Container {
    Container nextContainer;
    User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setNextContainer(Container nextContainer) {
        this.nextContainer = nextContainer;
    }

    public Container(User user) {
        this.user = user;
    }

    public Container getNextContainer() {
        return nextContainer;
    }


}






