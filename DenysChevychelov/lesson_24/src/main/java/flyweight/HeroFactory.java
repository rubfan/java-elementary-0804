package flyweight;

import java.util.HashMap;
import java.util.Map;

public class HeroFactory {
    private static final Map<String, Hero> heroes = new HashMap<String, Hero>();

    public Hero takeHeroByClassName(String warriorName) {
        Hero hero = heroes.get(warriorName);
        if (hero == null) {
            if ("Knight".equals(warriorName)) {
                System.out.println("Take Knight...");
                hero = new Knight();
            } else if ("Archer".equals(warriorName)) {
                System.out.println("Take Archer...");
                hero = new Archer();
            }
            heroes.put(warriorName, hero);
        }
        return hero;
    }
}
