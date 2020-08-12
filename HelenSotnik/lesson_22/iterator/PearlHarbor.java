package iterator;

public class PearlHarbor implements Harbor {
    public String ships[];

    public PearlHarbor(String[] ships) {
        this.ships = ships;
    }

    public void setShips(String[] ships) {
        this.ships = ships;
    }

    public String[] getShips() {
        return ships;
    }

    @Override
    public Iterator createIterator() {
        return new ShipIterator();
    }

    public class ShipIterator implements Iterator {
        private int position;

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        @Override
        public boolean hasNextShip() {
            if (ships.length > position) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object nextShip() throws ArrayIndexOutOfBoundsException {
            if (hasNextShip() == true) {
                return ships[position++];
            } else if (hasNextShip() == false) {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
            return null;
        }
    }
}
