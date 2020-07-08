package lesson10Test;

import lesson10.FarmService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FarmServiceTest {
    FarmService farmService = new FarmService();

    @Before
    public void initAllFarmArgs() {
        farmService.setValueForFarmPrice(700);
        farmService.setValueForAmountOfCow(70);
        farmService.setValueForProduceMilk(4);
        farmService.setValueForConsumeFeed(7);
        farmService.setValueForPriceFeedToPurchase(2);
        farmService.setValueForPriceMilkToSell(8);
        farmService.setValueForPayTax(15);
        farmService.setValueForPaySalaryToStaff(10);
    }

    @Test
    public void checkAllFarmArgsIfSetMinValue() {
        farmService.setValueForFarmPrice(500);
        Assert.assertThat(farmService.getCowFarm().getFarmPrice(), is(500d));

        farmService.setValueForAmountOfCow(50);
        Assert.assertThat(farmService.getCowFarm().getAmountOfCow(), is(50));

        farmService.setValueForProduceMilk(1);
        Assert.assertThat(farmService.getCow().getProduceMilkPerDay(), is(1d));

        farmService.setValueForConsumeFeed(5);
        Assert.assertThat(farmService.getCow().getConsumeFeedPerDay(), is(5d));

        farmService.setValueForPriceFeedToPurchase(1);
        Assert.assertThat(farmService.getFarmer().getPriceFeedForPurchase(), is(1d));

        farmService.setValueForPriceMilkToSell(5);
        Assert.assertThat(farmService.getFarmer().getPriceMilkForSell(), is(5d));

        farmService.setValueForPayTax(10);
        Assert.assertThat(farmService.getFarmer().getPayTax(), is(10d));

        farmService.setValueForPaySalaryToStaff(5);
        Assert.assertThat(farmService.getFarmer().getPaySalaryToStaff(), is(5d));
    }

    @Test
    public void checkAllFarmArgsIfSetMaxValue() {
        farmService.setValueForFarmPrice(1000);
        Assert.assertThat(farmService.getCowFarm().getFarmPrice(), equalTo(1000d));

        farmService.setValueForAmountOfCow(100);
        Assert.assertThat(farmService.getCowFarm().getAmountOfCow(), equalTo(100));

        farmService.setValueForProduceMilk(5);
        Assert.assertThat(farmService.getCow().getProduceMilkPerDay(), equalTo(5d));

        farmService.setValueForConsumeFeed(10);
        Assert.assertThat(farmService.getCow().getConsumeFeedPerDay(), equalTo(10d));

        farmService.setValueForPriceFeedToPurchase(3);
        Assert.assertThat(farmService.getFarmer().getPriceFeedForPurchase(), equalTo(3d));

        farmService.setValueForPriceMilkToSell(10);
        Assert.assertThat(farmService.getFarmer().getPriceMilkForSell(), equalTo(10d));

        farmService.setValueForPayTax(20);
        Assert.assertThat(farmService.getFarmer().getPayTax(), equalTo(20d));

        farmService.setValueForPaySalaryToStaff(10);
        Assert.assertThat(farmService.getFarmer().getPaySalaryToStaff(), equalTo(10d));
    }

    @Test
    public void ifFarmArgsAreLowerThenMinLimitsShouldReturnInputError() {
        Assert.assertThat(farmService.setValueForFarmPrice(499),
                is("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForAmountOfCow(49),
                is("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForProduceMilk(0.9),
                is("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForConsumeFeed(4),
                is("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForPriceFeedToPurchase(0.9),
                is("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForPriceMilkToSell(4),
                is("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForPayTax(9),
                is("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForPaySalaryToStaff(4),
                is("INPUT PARAMS ARE INCORRECT"));
    }

    @Test
    public void ifFarmArgsAreHigherThenMaxLimitsShouldReturnInputError() {
        Assert.assertThat(farmService.setValueForFarmPrice(1001),
                equalTo("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForAmountOfCow(101),
                equalTo("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForProduceMilk(6),
                equalTo("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForConsumeFeed(11),
                equalTo("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForPriceFeedToPurchase(3.5),
                equalTo("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForPriceMilkToSell(11),
                equalTo("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForPayTax(21),
                equalTo("INPUT PARAMS ARE INCORRECT"));

        Assert.assertThat(farmService.setValueForPaySalaryToStaff(11),
                equalTo("INPUT PARAMS ARE INCORRECT"));
    }

    @Test
    public void checkCalculatingProfitWithoutTaxAndSalary() {
        int cows = farmService.getCowFarm().getAmountOfCow();
        double produceMilk = farmService.getCow().getProduceMilkPerDay();
        double consumeFeed = farmService.getCow().getConsumeFeedPerDay();
        double milkPrice = farmService.getFarmer().getPriceMilkForSell();
        double feedPrice = farmService.getFarmer().getPriceFeedForPurchase();
        double profit = (produceMilk * milkPrice - consumeFeed * feedPrice) * cows * 365;
        Assert.assertThat(farmService.calculateFarmProfit(), is(profit));
    }

    @Test
    public void checkCalculatingProfitAfterPayTax() {
        double getTax = farmService.getFarmer().getPayTax();
        double tax = 3000 - 3000d / 100 * getTax;
        Assert.assertThat(farmService.calculateFarmProfitAfterTax(3000), is(tax));
    }

    @Test
    public void checkCalculatingProfitAfterPaySalary() {
        double getSalary = farmService.getFarmer().getPaySalaryToStaff();
        double salary = 3000 - 3000d / 100 * getSalary;
        Assert.assertThat(farmService.calculateFarmProfitAfterSalary(3000), equalTo(salary));
    }

    @Test
    public void checkCalculatingProfitAfterAllExpenses() {
        Assert.assertThat(farmService.calculateClearFarmProfit(), is("SUPER PROFITABLE"));
    }

    @Test
    public void checkHowManyFarmsPurchasesIfYearlyProfitIsVeryGood() {
        Assert.assertThat(farmService.calculateAbleToBuyNewFarm(3000), equalTo("SUPER PROFITABLE"));
    }

    @Test
    public void checkHowManyFarmsPurchasesIfYearlyProfitIsNormal() {
        Assert.assertThat(farmService.calculateAbleToBuyNewFarm(1500), equalTo("PROFITABLE"));
    }

    @Test
    public void checkHowManyFarmsPurchasesIfYearlyProfitIsPoor() {
        Assert.assertThat(farmService.calculateAbleToBuyNewFarm(500), equalTo("NOT PROFITABLE"));
    }
}
