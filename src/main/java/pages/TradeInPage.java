package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TradeInPage extends BasePage {

    @FindBy(xpath = "//button[@id='nextBtn']")
    private WebElement buttonNext;

    @FindBy(xpath = "//label[contains(text(),'Устройство включается?')]/following-sibling::div/button[contains(text(),'Да')]")
    private WebElement deviceTurnOnYes;

    @FindBy(xpath = "//label[contains(text(),'Все функции устройства работают?')]/following-sibling::div/button[contains(text(),'Да')]")
    private WebElement allDeviceFunctionsWorkYes;

    @FindBy(xpath = "//button[contains(text(),'Дисплей и корпус не имеет царапин и сколов')]")
    private WebElement displayIsOk;

    @FindBy(xpath = "//button[contains(text(),'Только устройство')]")
    private WebElement onlyDevice;

    @FindBy(xpath = "//input[@class='validate'][@name='name']")
    private WebElement contactName;

    @FindBy(xpath = "//input[@class='validate'][@name='phone']")
    private WebElement contactPhone;

    @FindBy(xpath = "//div/button[contains(text(),'Оформить заявку')]")
    private WebElement makeRequest;

    @FindBy(xpath = "//div[@class='right-h']//span[@class='ttl']")
    private WebElement thanksForOrder;

    public TradeInPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnNext() {
        buttonNext.click();
    }

    public void clickOnDeviceTurnOnYes() {
        deviceTurnOnYes.click();
    }

    public void clickOnAllDeviceFunctionsWorkYes() {
        allDeviceFunctionsWorkYes.click();
    }

    public void clickOnDisplayIsOk() {
        displayIsOk.click();
    }

    public void clickOnOnlyDevice() {
        onlyDevice.click();
    }

    public void fillInContactName(final String keyword) {
        contactName.sendKeys(keyword, Keys.ENTER);
    }

    public void fillInContactPhone(final String keyword) {
        contactPhone.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnMakeRequest() {
        makeRequest.click();
    }

    public String getTextThanksForOrder() {
        return thanksForOrder.getText();
    }
}
