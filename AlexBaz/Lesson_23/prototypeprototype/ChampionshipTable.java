package prototypeprototype;

import defaultpackage.ClubName;

interface CopyTable {
    CopyTable copy();
}

public class ChampionshipTable implements CopyTable {

    private ClubName clubName;
    private int points;


    @Override
    public ChampionshipTable copy() {
        ChampionshipTable championshipTable = new ChampionshipTable();
        return championshipTable;
    }

    public void setClubName(ClubName type) {
        this.clubName = type;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}




