import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class FarmTest {
    Farm farm = new Farm();

    @Test
    public void farmPriceTest() {
        double farmPrice = farm.findOutFarmPrice(600);
        double farmPrice2 = farm.findOutFarmPrice(350);
        double farmPrice3 = farm.findOutFarmPrice(499.99);
        double farmPrice4 = farm.findOutFarmPrice(1000);
        double farmPrice5 = farm.findOutFarmPrice(-10);
        assertThat(farmPrice, is(600.0));
        assertThat(farmPrice2, is(0.0));
        assertThat(farmPrice3, is(0.0));
        assertThat(farmPrice4, is(1000.0));
        assertThat(farmPrice5, is(0.0));
    }

    @Test
    public void cowsAmountTest() {
        int cowsAmount = farm.findOutCowsAmount(55);
        int cowsAmount2 = farm.findOutCowsAmount(4);
        int cowsAmount3 = farm.findOutCowsAmount(100);
        int cowsAmount4 = farm.findOutCowsAmount(-10);
        int cowsAmount5 = farm.findOutCowsAmount(49);
        assertThat(cowsAmount, is(55));
        assertThat(cowsAmount2, is(0));
        assertThat(cowsAmount3, is(100));
        assertThat(cowsAmount4, is(0));
        assertThat(cowsAmount5, is(0));
    }

    @Test
    public void milkLitersTest() {
        double milkLiters = farm.findOutMilkLiters(2.3);
        double milkLiters2 = farm.findOutMilkLiters(1);
        double milkLiters3 = farm.findOutMilkLiters(26);
        double milkLiters4 = farm.findOutMilkLiters(3);
        double milkLiters5 = farm.findOutMilkLiters(6);
        assertThat(milkLiters, is(2.3));
        assertThat(milkLiters2, is(1.0));
        assertThat(milkLiters3, is(0.0));
        assertThat(milkLiters4, is(3.0));
        assertThat(milkLiters5, is(0.0));
    }

    @Test
    public void feedAmountTest() {
        double feedAmount = farm.findOutFeedAmount(6.3);
        double feedAmount2 = farm.findOutFeedAmount(-30);
        double feedAmount3 = farm.findOutFeedAmount(9);
        double feedAmount4 = farm.findOutFeedAmount(4);
        double feedAmount5 = farm.findOutFeedAmount(11.8);
        assertThat(feedAmount, is(6.3));
        assertThat(feedAmount2, is(0.0));
        assertThat(feedAmount3, is(9.0));
        assertThat(feedAmount4, is(0.0));
        assertThat(feedAmount5, is(0.0));
    }

    @Test
    public void feedPriceTest() {
        double feedPrice = farm.findOutFeedPrice(2);
        double feedPrice2 = farm.findOutFeedPrice(-1);
        double feedPrice3 = farm.findOutFeedPrice(1.9);
        double feedPrice4 = farm.findOutFeedPrice(3.7);
        double feedPrice5 = farm.findOutFeedPrice(1);
        assertThat(feedPrice, is(2.0));
        assertThat(feedPrice2, is(0.0));
        assertThat(feedPrice3, is(1.9));
        assertThat(feedPrice4, is(0.0));
        assertThat(feedPrice5, is(1.0));
    }

    @Test
    public void milkPriceTest() {
        double milkPrice = farm.findOutMilkPrice(4.8);
        double milkPrice2 = farm.findOutMilkPrice(6);
        double milkPrice3 = farm.findOutMilkPrice(8.4);
        double milkPrice4 = farm.findOutMilkPrice(-3);
        double milkPrice5 = farm.findOutMilkPrice(249);
        assertThat(milkPrice, is(0.0));
        assertThat(milkPrice2, is(6.0));
        assertThat(milkPrice3, is(8.4));
        assertThat(milkPrice4, is(0.0));
        assertThat(milkPrice5, is(0.0));
    }

    @Test
    public void profitTaxTest() {
        int tax = farm.findOutProfitTax(22);
        int tax2 = farm.findOutProfitTax(12);
        int tax3 = farm.findOutProfitTax(17);
        int tax4 = farm.findOutProfitTax(-38);
        int tax5 = farm.findOutProfitTax(11);
        assertThat(tax, is(0));
        assertThat(tax2, is(12));
        assertThat(tax3, is(17));
        assertThat(tax4, is(0));
        assertThat(tax5, is(11));
    }

    @Test
    public void milkmaidSalaryTest() {
        int salary = farm.findOutMilkmaidSalary(5);
        int salary2 = farm.findOutMilkmaidSalary(10);
        int salary3 = farm.findOutMilkmaidSalary(-2);
        int salary4 = farm.findOutMilkmaidSalary(44);
        int salary5 = farm.findOutMilkmaidSalary(8);
        assertThat(salary, is(5));
        assertThat(salary2, is(10));
        assertThat(salary3, is(0));
        assertThat(salary4, is(0));
        assertThat(salary5, is(8));
    }
}
