import abstraktfactory.CurrentTour;
import abstraktfactory.NamberTour;
import builder.FootballPlayer;
import defaultpackage.ClubName;
import factory.League;
import factory.SpecificFactory;
import org.junit.Test;
import prototypeprototype.ChampionshipTable;
import singleton.FederationFootballUkrainian;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class PatternTest {

    @Test
    public void testAbstractFactory() {
        String start = "These competitions will require :";
        String finish = start + "\n" +
                "Administration organizes a match\n" +
                "Media organize the broadcast\n" +
                "Referee judge the match\n" +
                "Teams play soccer on the field";
        SpecificFactory specificFactory = new SpecificFactory();
        assertThat(specificFactory.function(), is(start));
        assertThat(specificFactory.getCompetition(League.HEIGHT), is(notNullValue()));
        assertThat(specificFactory.function(), is(finish));
    }

    @Test
    public void testBuilder() {
        String text = "FootballPlayer: name = 'Vladislav', surname = 'Kochergin', " +
                "age = 24, height = 178, weight = 70, currentClub = 'null', " +
                "previousClub = 'null', memberOfTheUkrainianNationalTeamGames = 0.";
        FootballPlayer footballPlayer = new FootballPlayer.Builder()
                .withName("Vladislav")
                .withSurname("Kochergin")
                .withAge(24)
                .withHeight(178)
                .withWeight(70)
                .build();
        assertThat(footballPlayer.toString(), is(text));
    }

    @Test
    public void testSingleton() {
        String text = "FederationFootballUkrainian. President Federation - Pavelko";
        FederationFootballUkrainian federationFootballUkrainian = FederationFootballUkrainian.getInstance("Pavelko");
        assertThat(federationFootballUkrainian.toString(), is(text));
        FederationFootballUkrainian federationFootballUkrainian2 = FederationFootballUkrainian.getInstance("Surkis");
        assertThat(federationFootballUkrainian.toString(), is(text));
    }

    @Test
    public void testChampionshipTable() {
        ChampionshipTable prototype = new ChampionshipTable();
        ChampionshipTable clonetype = prototype.copy();
        clonetype.setClubName(ClubName.ZORYA);
        clonetype.setPoints(58);
        assertThat(clonetype instanceof ChampionshipTable, is(true));
    }

    @Test
    public void testAbstract() {
        NamberTour tour1 = NamberTour.FOURTH;
        NamberTour tour2 = NamberTour.SIXTH;
        CurrentTour currentTour = new CurrentTour();

        assertThat(currentTour.getAbstractTour(tour1).createTour(tour1), is("4 tour championship Ukraine!"));
        assertThat(currentTour.getAbstractTour(tour1).getSpecificTour().getSpecificTour(), is("Matches will be held in autumn"));
        assertThat(currentTour.getAbstractTour(tour1).getSponsor().print(), is("Championship sponsor PariMatch!!!!"));

        assertThat(currentTour.getAbstractTour(tour2).createTour(tour2), is("6 tour championship Ukraine!"));
        assertThat(currentTour.getAbstractTour(tour2).getSpecificTour().getSpecificTour(), is("Matches will be held in spring"));
        assertThat(currentTour.getAbstractTour(tour2).getSponsor().print(), is("Championship sponsor FavBet!!!!"));
    }
}
