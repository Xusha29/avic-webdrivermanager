package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SendMessageTests extends BaseTest {

    private static final String EXPECTED_MESSAGE = "Сообщение успешно отправлено";

    @Test(priority = 1)
    public void checkFunctionalityOfTheLetterToTheDirector() {
        getHomePage().clickOnLetterToDirector();
        getSendMessagePage().waitVisibilityOfElement(10, getSendMessagePage().getAddMessagePopup());
        getSendMessagePage().fillInUserName("Oksana");
        getSendMessagePage().fillInUserEmail("Oksana@test.com");
        getSendMessagePage().fillInContent("Hi!");
        getSendMessagePage().clickOnSubmit();
        getSendMessagePage().waitVisibilityOfElement(10, getSendMessagePage().getAddThanksMessagePopup());

        String conformationMessage = getSendMessagePage().getTextMessageSentSuccessfully();
        Assert.assertEquals(conformationMessage, EXPECTED_MESSAGE);
    }

    @Test(priority = 2)
    public void checkFunctionalitySendMessageToSupport() {
        getHomePage().clickOnAddMessage();
        getSendMessagePage().waitVisibilityOfElement(10, getSendMessagePage().getAddMessagePopup());
        getSendMessagePage().clickOnSupport();
        getSendMessagePage().fillInUserNameSupport("Oksana");
        getSendMessagePage().fillInUserEmailSupport("Oksana@test.com");
        getSendMessagePage().fillInContentSupport("Hello");
        getSendMessagePage().clickOnSubmitSupport();
        getSendMessagePage().waitVisibilityOfElement(10, getSendMessagePage().getAddThanksMessagePopup());

        String conformationMessage = getSendMessagePage().getTextMessageSentSuccessfullySupport();
        Assert.assertEquals(conformationMessage, EXPECTED_MESSAGE);
    }
}
