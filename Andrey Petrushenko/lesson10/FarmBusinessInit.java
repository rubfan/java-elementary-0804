package FarmBusiness;

public class FarmBusinessInit {
    int numCows;

    public int setNumCows(int numCows) {
        this.numCows = numCows;
        if (numCows < 50 || numCows > 100) {
            System.out.println("INPUT PARAMS numCows ARE INCORRECT");
            return this.numCows = -1;
        }
        return this.numCows;
    }

    float amMilk;

    public float setamMilk(float amMilk) {
        this.amMilk = amMilk;
        if (amMilk < 1 || amMilk > 5) {
            System.out.println("INPUT PARAMS amMilk ARE INCORRECT");
            return this.amMilk = -1;
        }
        return this.amMilk;
    }

    float amFeed;

    public float setamFeed(float amFeed) {
        this.amFeed = amFeed;
        if (amFeed < 5 || amFeed > 10) {
            System.out.println("INPUT PARAMS amFeed ARE INCORRECT");
            return this.amFeed = -1;
        }
        return this.amFeed;
    }

    float priseFeed;

    public float setpriseFeed(float priseFeed) {
        this.priseFeed = priseFeed;
        if (priseFeed < 1 || priseFeed > 3) {
            System.out.println("INPUT PARAMS priseFeed ARE INCORRECT");
            return this.priseFeed = -1;
        }
        return this.priseFeed;
    }

    float costNewFarm;

    public float setcostNewFarm(float costNewFarm) {
        this.costNewFarm = costNewFarm;
        if (costNewFarm < 500 || costNewFarm > 1000) {
            System.out.println("INPUT PARAMS costNewFarm ARE INCORRECT");
            return this.costNewFarm = -1;
        }
        return this.costNewFarm;
    }

    float saleRev;

    public float setsaleRev(float saleRev) {
        this.saleRev = saleRev;
        if (saleRev < 5 || saleRev > 10) {
            System.out.println("INPUT PARAMS saleRev ARE INCORRECT");
            return this.saleRev = -1;
        }
        return this.saleRev;
    }

    float payTax;

    public float setpayTax(float payTax) {
        this.payTax = payTax;
        if (payTax < 10 || payTax > 20) {
            System.out.println("INPUT PARAMS payTax ARE INCORRECT");
            return this.payTax = -1;
        }
        return this.payTax;
    }

    float payWork;

    public float setpayWork(float payWork) {
        this.payWork = payWork;
        if (payWork < 5 || payWork > 10) {
            System.out.println("INPUT PARAMS payWork ARE INCORRECT");
            return this.payWork = -1;
        }
        return this.payWork;
    }

    private boolean checkInput() {
        return !(payWork < 0) && !(payTax < 0) && !(saleRev < 0)
                && !(costNewFarm < 0) && !(priseFeed < 0) && !(amFeed < 0) && !(amMilk < 0) && numCows >= 0;

    }

    private void initFarmParam() {
        final int daysPerYear = 365;
        int cows = setNumCows(56);
        float milk = setamMilk(3.8f);
        float sellMilk = setsaleRev(5.3f);
        float taxes = setpayTax(12f);
        float salary = setpayWork(8);
        float cowFeed = setamFeed(7);
        float feedPrise = setpriseFeed(2);
        float priseNewFarm = setcostNewFarm(750);
        float profit = (cows * milk * sellMilk) * daysPerYear;
        float buyFeed = (cows * cowFeed * feedPrise) * daysPerYear;
        float profitWithOutPaytax = (profit - buyFeed);
        if (checkInput()) {
            getFarmProfit(profitWithOutPaytax, taxes, salary, priseNewFarm);
        }
    }

    private void getFarmProfit(float p, float t, float s, float bf) {
        float payTax = p - (p * (t / 100));
        float paySalary = payTax - (payTax * (s / 100));
        int chanseToBuy = (int) (paySalary / bf);
        if (chanseToBuy <= 1) {
            System.out.println("NOT PROFITABLE");
        }
        if ((chanseToBuy >= 1) && (chanseToBuy <= 3)) {
            System.out.println("PROFITABLE");
        }
        if (chanseToBuy > 3) {
            System.out.println("SUPER PROFITABLE");
        }
    }
    public int getchanseToBuy(int chanseToBuy){
        return chanseToBuy;
    }
}


