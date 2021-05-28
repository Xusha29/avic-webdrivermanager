package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private static final String EXPECTED_QUERY = "discount";

    @Test(priority = 1)
    public void checkThatUrlContainsDiscount() {
        getHomePage().clickOnDiscountGoods();

        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_QUERY));
    }
}
