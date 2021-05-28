package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TradeInTests extends BaseTest {

    private static final String THANKS_FOR_ORDER = "Благодарим за заказ";

    @Test(priority = 1)
    public void checkTheFunctionalityTradeInScore() {
        getHomePage().clickOnTradeInGoods();
        getTradeInPage().waitForPageLoadComplete(10);
        getTradeInPage().clickOnNext();
        getTradeInPage().clickOnNext();
        getTradeInPage().clickOnDeviceTurnOnYes();
        getTradeInPage().clickOnNext();
        getTradeInPage().clickOnAllDeviceFunctionsWorkYes();
        getTradeInPage().clickOnNext();
        getTradeInPage().clickOnDisplayIsOk();
        getTradeInPage().clickOnNext();
        getTradeInPage().clickOnOnlyDevice();
        getTradeInPage().clickOnNext();
        getTradeInPage().fillInContactName("Oksana");
        getTradeInPage().fillInContactPhone("0630000000");
        getTradeInPage().clickOnMakeRequest();
        getTradeInPage().implicitWait(10);

        String conformationMessage = getTradeInPage().getTextThanksForOrder();
        Assert.assertEquals(conformationMessage, THANKS_FOR_ORDER);
    }
}
