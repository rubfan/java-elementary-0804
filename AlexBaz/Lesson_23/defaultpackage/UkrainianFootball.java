package defaultpackage;

import abstraktfactory.CurrentTour;
import abstraktfactory.NamberTour;
import builder.FootballPlayer;
import factory.AbstractFactory;
import factory.League;
import factory.SpecificFactory;
import prototypeprototype.ChampionshipTable;
import singleton.FederationFootballUkrainian;

public class UkrainianFootball {
    public static void main(String[] args) {
        AbstractFactory heightLeague = new SpecificFactory();
        heightLeague.getCompetition(League.HEIGHT);
        heightLeague.function();

        FootballPlayer footballPlayer = new FootballPlayer.Builder()
                .withName("Vladislav")
                .withSurname("Kochergin")
                .withAge(24)
                .withHeight(178)
                .withWeight(70)
                .build();
        System.out.println(footballPlayer.toString());

        FederationFootballUkrainian federationFootballUkrainian = FederationFootballUkrainian.getInstance("Pavelko");
        System.out.println(federationFootballUkrainian.toString());

        ChampionshipTable prototype = new ChampionshipTable();
        ChampionshipTable clone = prototype.copy();
        clone.setClubName(ClubName.ZORYA);
        clone.setPoints(58);

        CurrentTour currentTour = new CurrentTour();
        System.out.println(currentTour.getAbstractTour(NamberTour.FIFTH).createTour(NamberTour.FIFTH));
        System.out.println(currentTour.getAbstractTour(NamberTour.FIFTH).getSpecificTour().getSpecificTour());
        System.out.println(currentTour.getAbstractTour(NamberTour.FIFTH).getSponsor().print());


    }
}
