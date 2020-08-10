package homework10Farm;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FarmTest {
    Farm farm = new Farm();

    @Before
    public void initFarmAndCowParameters() {
        farm.setFarmParams(500, 10, 10);
        farm.setCowParams(50, 8, 3, 3, 10);
    }

    @Test
    public void testOfSetMiddleValidFarmParams() {
        farm.setFarmParams(850f, 15.5f, 8.5f);
        assertThat(farm.getFarmPrice(), equalTo(850f));
        assertThat(farm.getPercentIncomeTax(), equalTo(15.5f));
        assertThat(farm.getPercentSalaryToMilkmaids(), equalTo(8.5f));
    }

    @Test
    public void testOfSetMiddleValidCowParams() {
        farm.setCowParams(80, 8f, 2f, 3f, 8f);
        assertThat(farm.getNumberOfCows(), equalTo(80));
        assertThat(farm.cows.getCowFoodConsumption(), equalTo(8f));
        assertThat(farm.cows.getCowFoodPrise(), equalTo(2f));
        assertThat(farm.cows.getCowMilkProduction(), equalTo(3f));
        assertThat(farm.cows.getCowMilkPrice(), equalTo(8f));
    }

    @Test
    public void testOfSetMinimalValidFarmParams() {
        farm.setFarmParams(500f, 10f, 5f);
        assertThat(farm.getFarmPrice(), equalTo(500f));
        assertThat(farm.getPercentIncomeTax(), equalTo(10f));
        assertThat(farm.getPercentSalaryToMilkmaids(), equalTo(5f));
    }

    @Test
    public void testOfSetMinimalValidCowParams() {
        farm.setCowParams(50, 5f, 1f, 1f, 5f);
        assertThat(farm.getNumberOfCows(), equalTo(50));
        assertThat(farm.cows.getCowFoodConsumption(), equalTo(5f));
        assertThat(farm.cows.getCowFoodPrise(), equalTo(1f));
        assertThat(farm.cows.getCowMilkProduction(), equalTo(1f));
        assertThat(farm.cows.getCowMilkPrice(), equalTo(5f));
    }

    @Test
    public void testOfSetMaximalValidFarmParams() {
        farm.setFarmParams(1000f, 20f, 10f);
        assertThat(farm.getFarmPrice(), equalTo(1000f));
        assertThat(farm.getPercentIncomeTax(), equalTo(20f));
        assertThat(farm.getPercentSalaryToMilkmaids(), equalTo(10f));
    }

    @Test
    public void testOfSetMaximalValidCowParams() {
        farm.setCowParams(100, 10f, 3f, 5f, 10f);
        assertThat(farm.getNumberOfCows(), equalTo(100));
        assertThat(farm.cows.getCowFoodConsumption(), equalTo(10f));
        assertThat(farm.cows.getCowFoodPrise(), equalTo(3f));
        assertThat(farm.cows.getCowMilkProduction(), equalTo(5f));
        assertThat(farm.cows.getCowMilkPrice(), equalTo(10f));
    }

    @Test
    public void ifFarmParamsLessThenLowerLimitsPrintInputParamsAreIncorrect() {
        assertThat(farm.setFarmParams(499f, 15f, 8f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setFarmParams(500f, 9f, 8f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setFarmParams(500f, 15f, 4f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
    }

    @Test
    public void ifCowParamsLessThenLowerLimitsPrintInputParamsAreIncorrect() {
        assertThat(farm.setCowParams(49, 7f, 3f, 5f, 6f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setCowParams(60, 4f, 3f, 5f, 6f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setCowParams(60, 7f, 0f, 5f, 6f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setCowParams(60, 7f, 3f, 0f, 6f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setCowParams(60, 7f, 3f, 5f, 4f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
    }

    @Test
    public void ifFarmParamsGreaterThenUpperLimitsPrintInputParamsAreIncorrect() {
        assertThat(farm.setFarmParams(1001f, 15f, 8f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setFarmParams(700f, 21f, 8f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setFarmParams(1000f, 15f, 11f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
    }

    @Test
    public void ifCowParamsGreaterThenUpperLimitsPrintInputParamsAreIncorrect() {
        assertThat(farm.setCowParams(101, 7f, 3f, 5f, 6f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setCowParams(60, 11f, 3f, 5f, 6f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setCowParams(60, 7f, 4f, 5f, 6f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setCowParams(60, 7f, 3f, 6f, 6f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
        assertThat(farm.setCowParams(60, 7f, 3f, 5f, 11f),
                equalTo("INPUT PARAMS ARE INCORRECT."));
    }

    @Test
    public void testCalculateYearlyAllCowYearlyRevenue() {
        assertThat(farm.calculateYearlyAllCowsRevenue(), is(equalTo((3*10-8*3f)*365*50f)));
    }

    @Test
    public void testCalculateYearlyRevenueAfter10PercentTax() {
        assertThat(farm.calculateYearlyRevenueAfterTax(1000f), is(equalTo(900f)));
    }

    @Test
    public void testCalculateYearlyRevenueAfter10PercentSalary() {
        assertThat(farm.calculateYearlyRevenueAfterSalary(2000f), is(equalTo(1800f)));
    }

    @Test
    public void ifRevenue2000NumberOfFarmsIs4chanceBuyNewFarmsIsSuperProfitable() {
        assertThat(farm.calculateChanceBuyNewFarms(2000f), equalTo("SUPER PROFITABLE"));
    }

    @Test
    public void ifRevenue1500NumberOfFarmsIs3chanceBuyNewFarmsIsProfitable() {
        assertThat(farm.calculateChanceBuyNewFarms(1500f), equalTo("PROFITABLE"));
    }

    @Test
    public void ifRevenue1000NumberOfFarmsIs2chanceBuyNewFarmsIsSuperProfitable() {
        assertThat(farm.calculateChanceBuyNewFarms(1000f), equalTo("PROFITABLE"));
    }


    @Test
    public void ifRevenue0chanceBuyNewFarmsIsNotProfitable() {
        assertThat(farm.calculateChanceBuyNewFarms(0f), equalTo("NOT PROFITABLE"));
    }

    @Test
    public void testCalculateFarmProfitSuperProfitableResult() {
        assertThat(farm.calculateFarmProfit(), equalTo("SUPER PROFITABLE"));
    }

    @Test
    public void testCalculateFarmProfitProfitableResult() {
        farm.setFarmParams(500f, 20f, 10f);
        farm.setCowParams(50, 6.65f, 3f, 2f, 10f);
        assertThat(farm.calculateFarmProfit(), equalTo("PROFITABLE"));
    }

    @Test
    public void testCalculateFarmProfitNotProfitableResult() {
        farm.setFarmParams(500f, 20f, 10f);
        farm.setCowParams(50, 8f, 3f, 2f, 10f);
        assertThat(farm.calculateFarmProfit(), equalTo("NOT PROFITABLE"));
    }
}