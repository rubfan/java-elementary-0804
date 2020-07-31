package abstraktfactory;

public interface Sponsor {
    String print();
}

class FirstCircleInvestor implements Sponsor {

    @Override
    public String print() {
        return "Championship sponsor PariMatch!!!!";
    }
}

class SecondCircleInvestor implements Sponsor {

    @Override
    public String print() {
        return "Championship sponsor FavBet!!!!";
    }
}
