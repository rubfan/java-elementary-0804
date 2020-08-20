package adapter;

public class Statistic {
    void shotsOnGoal() {
        System.out.println("shots on goal");
    }

    void ballControl() {
        System.out.println("ball control");
    }
}

interface Specifications {
    void shot();

    void dribbling();
}

//через наследование
class AdapterStatistic1 extends Statistic implements Specifications {

    @Override
    public void shot() {
        shotsOnGoal();
    }

    @Override
    public void dribbling() {
        ballControl();
    }
}

//через композицию

class AdapterStatistic2 implements Specifications {
    Statistic statistic = null;

    public AdapterStatistic2(Statistic statistic) {
        this.statistic = statistic;
    }

    @Override
    public void shot() {
        statistic.shotsOnGoal();
    }

    @Override
    public void dribbling() {
        statistic.ballControl();
    }
}


class Main {
    public static void main(String[] args) {
        Specifications s1 = new AdapterStatistic1();
        s1.shot();
        s1.dribbling();

        Specifications s2 = new AdapterStatistic2(new Statistic());
        s2.shot();
        s2.dribbling();
    }
}
