package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendMessagePage extends BasePage {

    private static final String FORM_DIRECTOR = "//form[@data-recipient-name='Директору магазина']";
    private static final String FORM_SERVICE = "//form[@data-recipient-name='Служба поддержки']";

    @FindBy(id = "js_addMessage")
    private WebElement addMessagePopup;

    @FindBy(id = "js_addThanksMessage")
    private WebElement addThanksMessagePopup;

    @FindBy(xpath = FORM_DIRECTOR + "//input[@class='validate'][@name='user_name']")
    private WebElement userName;

    @FindBy(xpath = FORM_DIRECTOR + "//input[@class='validate'][@name='user_email']")
    private WebElement userEmail;

    @FindBy(xpath = FORM_DIRECTOR + "//textarea[@class='validate'][@name='content']")
    private WebElement content;

    @FindBy(xpath = FORM_DIRECTOR + "//button[@type='submit']")
    private WebElement submit;

    @FindBy(xpath = "//div[@class='ttl color-green']")
    private WebElement messageSentSuccessfully;

    @FindBy(xpath = "//a[contains(text(),'Служба поддержки')]")
    private WebElement support;

    @FindBy(xpath = FORM_SERVICE + "//input[@class='validate'][@name='user_name']")
    private WebElement userNameSupport;

    @FindBy(xpath = FORM_SERVICE + "//input[@class='validate'][@name='user_email']")
    private WebElement userEmailSupport;

    @FindBy(xpath = FORM_SERVICE + "//textarea[@class='validate'][@name='content']")
    private WebElement contentSupport;

    @FindBy(xpath = FORM_SERVICE + "//button[@type='submit']")
    private WebElement submitSupport;

    @FindBy(xpath = "//div[@class='ttl color-green']")
    private WebElement messageSentSuccessfullySupport;

    public SendMessagePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddMessagePopup() {
        return addMessagePopup;
    }

    public WebElement getAddThanksMessagePopup() {
        return addThanksMessagePopup;
    }

    public void fillInUserName(final String keyword) {
        userName.sendKeys(keyword, Keys.ENTER);
    }

    public void fillInUserEmail(final String keyword) {
        userEmail.sendKeys(keyword, Keys.ENTER);
    }

    public void fillInContent(final String keyword) {
        content.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnSubmit() {
        submit.click();
    }

    public String getTextMessageSentSuccessfully() {
        return messageSentSuccessfully.getText();
    }

    public void clickOnSupport() {
        support.click();
    }

    public void fillInUserNameSupport(final String keyword) {
        userNameSupport.sendKeys(keyword, Keys.ENTER);
    }

    public void fillInUserEmailSupport(final String keyword) {
        userEmailSupport.sendKeys(keyword, Keys.ENTER);
    }

    public void fillInContentSupport(final String keyword) {
        contentSupport.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnSubmitSupport() {
        submitSupport.click();
    }

    public String getTextMessageSentSuccessfullySupport() {
        return messageSentSuccessfullySupport.getText();
    }

}
