package flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightClient {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        List<Hero> heroes = new ArrayList<Hero>();
        for (int i = 0; i < 10; i++) {
            heroes.add(heroFactory.takeHeroByClassName("Archer"));
            heroes.add(heroFactory.takeHeroByClassName("Knight"));
        }

        for (Hero hero : heroes) {
            hero.move();
        }
    }
}
