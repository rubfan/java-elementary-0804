package strategy;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();

        List<FootballPlayerBombardier> playerBombardiers = new ArrayList<FootballPlayerBombardier>();

        playerBombardiers.add(new FootballPlayerBombardier("Александр Филиппов", "Десна", 16, 30));
        playerBombardiers.add(new FootballPlayerBombardier("Владислав Супряга", "Днепр-1", 14, 24));
        playerBombardiers.add(new FootballPlayerBombardier("Жуниор Мораес", "Шахтер", 20, 27));
        playerBombardiers.add(new FootballPlayerBombardier("Виктор Цыганков", "Динамо ", 14, 27));
        playerBombardiers.add(new FootballPlayerBombardier("Богдан Леднев", "Заря", 10, 25));
        playerBombardiers.add(new FootballPlayerBombardier("Марлос", "Шахтер", 13, 24));
        playerBombardiers.add(new FootballPlayerBombardier("Беньямин Вербич", "Динамо Киев", 11, 25));
        playerBombardiers.add(new FootballPlayerBombardier("Виталий Буяльский", "Динамо Киев", 9, 27));
        playerBombardiers.add(new FootballPlayerBombardier("Тайсон", "Шахтер", 10, 25));
        playerBombardiers.add(new FootballPlayerBombardier("Максим Третьяков", "Александрия", 10, 28));

        strategyClient.setStrategy(new SortGames());
        strategyClient.executeStrategy(playerBombardiers);
        System.out.println("__________________________________________________________________________");
        strategyClient.setStrategy(new SortGoals());
        strategyClient.executeStrategy(playerBombardiers);
    }
}

interface Sorting {
    public void sort(List<FootballPlayerBombardier> playerBombardiers);
}

public class StrategyClient {
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(List<FootballPlayerBombardier> playerBombardiers) {
        strategy.sort(playerBombardiers);
    }
}

class SortGames implements Sorting {
    public void sort(List<FootballPlayerBombardier> players) {
        List<FootballPlayerBombardier> playerBombardiers = players;
        boolean isSorted = false;
        FootballPlayerBombardier buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < playerBombardiers.size() - 1; i++) {
                if (playerBombardiers.get(i).getGames() < playerBombardiers.get(i + 1).getGames()) {
                    isSorted = false;
                    buf = playerBombardiers.get(i);
                    playerBombardiers.set(i, playerBombardiers.get(i + 1));
                    playerBombardiers.set(i + 1, buf);
                }
            }
        }
        for (FootballPlayerBombardier item : playerBombardiers) {
            System.out.println(item.toString());
        }
    }
}

class SortGoals implements Sorting {
    public void sort(List<FootballPlayerBombardier> players) {
        List<FootballPlayerBombardier> playerBombardiers = players;
        boolean isSorted = false;
        FootballPlayerBombardier buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < playerBombardiers.size() - 1; i++) {
                if (playerBombardiers.get(i).getGoals() < playerBombardiers.get(i + 1).getGoals()) {
                    isSorted = false;
                    buf = playerBombardiers.get(i);
                    playerBombardiers.set(i, playerBombardiers.get(i + 1));
                    playerBombardiers.set(i + 1, buf);
                }
            }
        }
        for (FootballPlayerBombardier item : playerBombardiers) {
            System.out.println(item.toString());
        }
    }
}
