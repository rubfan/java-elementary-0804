package iterator;

public class IteratorDemo {
    public static void main(String[] args) throws Exception {
        String ships[] = {"Dock landing ship", "Amphibious ship", "Corvette", "Corvette"};
        Harbor pearlHarbor = new PearlHarbor(ships);

        System.out.println("Pearl Harbor military ships: ");

        for (Iterator iter = pearlHarbor.createIterator(); iter.hasNextShip(); ) {
            String name = (String) iter.nextShip();
            System.out.println("Name : " + name);
        }
    }
}
