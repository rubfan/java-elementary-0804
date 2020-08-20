package prototype;

public class Client {
    public static void main(String[] args) {
        SpaceShip round = new SpaceShip("Round", 100, 14.5,
                new Alien("Mike", 192d, 110d));
        System.out.println(round);

        SpaceShip clone1 = (SpaceShip) round.createClone();
        clone1.setName("Cube");
        clone1.getCaptain().setName("Mike1");
        SpaceShip clone2 = (SpaceShip) clone1.createClone();
        SpaceShip clone3 = (SpaceShip) round.createClone();
        clone2.setCrew(200);
        clone3.setName("WeirdShape");
        clone3.getCaptain().setName("Mike2");

        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
    }
}
