import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ProfitabilityTest {
    Farm farm = new Farm();
    EconomicIndicators indicators = new EconomicIndicators();

    @Before
    public void init() {
        farm.setCowCount(75);
        farm.setMilkProductionPerCow(4.5f);
        farm.setCowFoodConsumption(7.5f);
        indicators.setFarmBuyPrice(750);
        indicators.setMilkSellPrice(8);
        indicators.setCowFoodBuyPrice(2);
        indicators.setProfitTaxRate(15);
        indicators.setSalaryFromProfitAfterTaxRate(7.5f);
    }

    @Test
    public void testProfitabilityCalculation() {
        assertThat(Profitability.profitabilityEvaluation(farm, indicators), equalTo(612));
    }

    @Test
    public void testSalaryCalculation() {
        float salary = Profitability.directSalary(farm, indicators);
        float profitAfterTax = Profitability.profitAfterTax(farm, indicators);
        float salaryRate = indicators.getSalaryFromProfitAfterTaxRate() / 100;
        assertThat(salary / profitAfterTax, equalTo(salaryRate));
    }

    @Test
    public void testValidInputValues() {
        assertThat(Profitability.profitabilityEvaluation(farm, indicators), is(not(-1)));
    }

    @Test
    public void testOneInputValueBelowLimit() {
        indicators.setFarmBuyPrice(300);
        assertThat(Profitability.profitabilityEvaluation(farm, indicators), equalTo(-1));
    }

    @Test
    public void testAllInputValuesBelowLimit() {
        farm.setCowCount(40);
        farm.setMilkProductionPerCow(0.5f);
        farm.setCowFoodConsumption(3);
        indicators.setFarmBuyPrice(300);
        indicators.setMilkSellPrice(3);
        indicators.setCowFoodBuyPrice(0.5f);
        indicators.setProfitTaxRate(5);
        indicators.setSalaryFromProfitAfterTaxRate(3);
        assertThat(Profitability.profitabilityEvaluation(farm, indicators), equalTo(-1));
    }

    @Test
    public void testAllInputValuesAtLowerBound() {
        farm.setCowCount(50);
        farm.setMilkProductionPerCow(1);
        farm.setCowFoodConsumption(5);
        indicators.setFarmBuyPrice(500);
        indicators.setMilkSellPrice(5);
        indicators.setCowFoodBuyPrice(1);
        indicators.setProfitTaxRate(10);
        indicators.setSalaryFromProfitAfterTaxRate(5);
        assertThat(Profitability.profitabilityEvaluation(farm, indicators), is(not(-1)));
    }

    @Test
    public void testAllInputValuesAtUpperBound() {
        farm.setCowCount(100);
        farm.setMilkProductionPerCow(5);
        farm.setCowFoodConsumption(10);
        indicators.setFarmBuyPrice(1000);
        indicators.setMilkSellPrice(10);
        indicators.setCowFoodBuyPrice(3);
        indicators.setProfitTaxRate(20);
        indicators.setSalaryFromProfitAfterTaxRate(10);
        assertThat(Profitability.profitabilityEvaluation(farm, indicators), is(not(-1)));
    }

    @Test
    public void testOneInputValueAboveLimit() {
        indicators.setFarmBuyPrice(1100);
        assertThat(Profitability.profitabilityEvaluation(farm, indicators), equalTo(-1));
    }

    @Test
    public void testAllInputValuesAboveLimit() {
        farm.setCowCount(120);
        farm.setMilkProductionPerCow(10);
        farm.setCowFoodConsumption(20);
        indicators.setFarmBuyPrice(1100);
        indicators.setMilkSellPrice(15);
        indicators.setCowFoodBuyPrice(10);
        indicators.setProfitTaxRate(25);
        indicators.setSalaryFromProfitAfterTaxRate(15);
        assertThat(Profitability.profitabilityEvaluation(farm, indicators), equalTo(-1));
    }
}