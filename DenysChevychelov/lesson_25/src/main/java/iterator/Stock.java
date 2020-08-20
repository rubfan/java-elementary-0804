package iterator;

public class Stock implements Collection {
    private String number;
    private String[] products;

    public Stock(String number, String[] products) {
        this.number = number;
        this.products = products;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String[] getProducts() {
        return this.products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (this.index < products.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return products[index++];
        }
    }
}
