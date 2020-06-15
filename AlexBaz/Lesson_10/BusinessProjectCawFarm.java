public class BusinessProjectCawFarm {
    private double priceFarm, profit, netProfit, netProfitNotSalaries, givesCowMilk, cowEatingFood, priceLiterMilk, incomeTax, salariesToMilkmaids, priceEatingFood, buyFarm, quantityCow;

    public double setProfit() {
        double revenue = (quantityCow * givesCowMilk * priceLiterMilk * 365);
        double expenses = (quantityCow * cowEatingFood * priceEatingFood * 365);
        if (revenue > 0 && expenses > 0) {
            profit = revenue - expenses;
            return profit;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return -1;
        }
    }

    public double setNetProfit() {
        if (profit > 0) {
            netProfitNotSalaries = profit - (profit * incomeTax / 100);
            netProfit = netProfitNotSalaries - (netProfitNotSalaries * salariesToMilkmaids / 100);
            return netProfit;
        } else {
            System.out.println(" Profit is negative, your bankrupt");
            return -1;
        }
    }

    public double buyFarmPay() {
        buyFarm = (int) (netProfit / priceFarm);
        System.out.println(" Farm net profit = " + netProfit + " farm quantity one can buy = " + buyFarm);
        return buyFarm;
    }

    public String profitable() {
        if (buyFarm < 1) {
            System.out.println("NOT PROFITABLE");
            return "NOT PROFITABLE";
        } else if (buyFarm >= 1 && buyFarm < 3) {
            System.out.println("PROFITABLE");
            return "PROFITABLE";
        } else {
            System.out.println("SUPER PROFITABLE");
            return "SUPER PROFITABLE";
        }
    }

    public double setQuantityCow(double quantityCow) {
        if (quantityCow >= 50 && quantityCow <= 100) {
            this.quantityCow = quantityCow;
            return this.quantityCow;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return -1;
        }
    }

    public double setGivesCowMilk(double givesCawMilk) {
        if (givesCawMilk >= 1 && givesCawMilk <= 5) {
            this.givesCowMilk = givesCawMilk;
            return this.givesCowMilk;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return -1;
        }
    }

    public double setPriceFarm(double priceFarm) {
        if (priceFarm >= 500 && priceFarm <= 1000) {
            this.priceFarm = priceFarm;
            return this.priceFarm;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return -1;
        }
    }

    public double setPriceEatingFood(double priceEatingFood) {
        if (priceEatingFood >= 1 && priceEatingFood <= 3) {
            this.priceEatingFood = priceEatingFood;
            return this.priceEatingFood;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return -1;
        }
    }

    public double setCowEatingFood(double cowEatingFood) {
        if (cowEatingFood >= 5 && cowEatingFood <= 10) {
            this.cowEatingFood = cowEatingFood;
            return this.cowEatingFood;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return -1;
        }
    }

    public double setPriseLiterMilk(double priceLiterMilk) {
        if (priceLiterMilk >= 5 && priceLiterMilk <= 10) {
            this.priceLiterMilk = priceLiterMilk;
            return this.priceLiterMilk;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return -1;
        }
    }

    public double setIncomeTax(double incomeTax) {
        if (incomeTax >= 10 && incomeTax <= 20) {
            this.incomeTax = incomeTax;
            return this.incomeTax;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return -1;
        }
    }

    public double setSalariesToMilkmaids(double salariesToMilkmaids) {
        if (salariesToMilkmaids >= 5 && salariesToMilkmaids <= 10) {
            this.salariesToMilkmaids = salariesToMilkmaids;
            return this.salariesToMilkmaids;
        } else {
            System.out.println("INPUT PARAMS ARE INCORRECT");
            return -1;
        }
    }

}
