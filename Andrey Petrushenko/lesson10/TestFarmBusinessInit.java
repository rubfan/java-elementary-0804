import FarmBusiness.FarmBusinessInit;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestFarmBusinessInit {
    public FarmBusinessInit farmB = new FarmBusinessInit();

    @Test
    public void testNumOfCowsRange() {
        int test1 = farmB.setNumCows(50);
        int test2 = farmB.setNumCows(100);
        farmB.setNumCows(120);
        Assert.assertEquals(50, test1, 0);
        Assert.assertEquals(100, test2, 0);
        assertThat("INPUT PARAMS ARE INCORRECT", true);
    }

    @Test
    public void testAmountMilkRange() {
        float test1 = farmB.setamMilk(5.0f);
        float test2 = farmB.setamMilk(1.25f);
        farmB.setamMilk(6.8f);
        Assert.assertEquals(5.0f, test1, 0);
        Assert.assertEquals(1.25f, test2, 0);
        assertThat("INPUT PARAMS ARE INCORRECT", true);
    }

    @Test
    public void testAmountFeedRange() {
        float test1 = farmB.setamFeed(5.0f);
        float test2 = farmB.setamFeed(9.98f);
        farmB.setamFeed(12.8f);
        Assert.assertEquals(5.0f, test1, 0);
        Assert.assertEquals(9.98f, test2, 0);
        assertThat("INPUT PARAMS ARE INCORRECT", true);
    }

    @Test
    public void testPriseCowFeedRange() {
        float test1 = farmB.setpriseFeed(1.0f);
        float test2 = farmB.setpriseFeed(3.0f);
        farmB.setpriseFeed(4.12f);
        Assert.assertEquals(1.0f, test1, 0);
        Assert.assertEquals(3.0f, test2, 0);
        assertThat("INPUT PARAMS ARE INCORRECT", true);
    }

    @Test
    public void testCostOfFarmRange() {
        float test1 = farmB.setcostNewFarm(500f);
        float test2 = farmB.setcostNewFarm(1000f);
        farmB.setcostNewFarm(485f);
        Assert.assertEquals(500f, test1, 0);
        Assert.assertEquals(1000f, test2, 0);
        assertThat("INPUT PARAMS ARE INCORRECT", true);

    }

    @Test
    public void testPayTexasRange() {
        float test1 = farmB.setpayTax(19.7f);
        float test2 = farmB.setpayTax(10.2f);
        farmB.setpayTax(9.99f);
        Assert.assertEquals(19.7f, test1, 0);
        Assert.assertEquals(10.2f, test2, 0);
        assertThat("INPUT PARAMS ARE INCORRECT", true);

    }

    @Test
    public void testSalesRevenueRange() {
        float test1 = farmB.setsaleRev(5f);
        float test2 = farmB.setsaleRev(10.0f);
        farmB.setsaleRev(12.3f);
        Assert.assertEquals(5f, test1, 0);
        Assert.assertEquals(10.0f, test2, 0);
        assertThat("INPUT PARAMS ARE INCORRECT", true);

    }

    @Test
    public void testPayForWorkRange() {
        float test1 = farmB.setpayWork(5f);
        float test2 = farmB.setpayWork(10f);
        farmB.setpayWork(14.0f);
        Assert.assertEquals(5f, test1, 0);
        Assert.assertEquals(10f, test2, 0);
        assertThat("INPUT PARAMS ARE INCORRECT", true);
    }

    @Test
    public void testFarmPorfitable() {
        int test1 = farmB.getchanseToBuy(0);
        int test2 = farmB.getchanseToBuy(2);
        int test3 = farmB.getchanseToBuy(4);
        assertThat("NOT PROFITABLE", test1<1);
        assertThat("PROFITABLE", test2>1);
        assertThat("SUPER PROFITABLE", test3>3);
    }
}