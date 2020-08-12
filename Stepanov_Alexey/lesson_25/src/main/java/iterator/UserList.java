package iterator;

public class UserList implements Container {
    public String names[] = {"Alex", "Bob", "Sam", "Andry", "Rob"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        public Object next() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}