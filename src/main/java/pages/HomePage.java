package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='top-links__left flex-wrap']//a[@href='/discount']")
    private WebElement discountGoods;

    @FindBy(xpath = "//a[@class='header-top__item'][contains(text(),'Trade-in оценка')]")
    private WebElement tradeInGoods;

    @FindBy(xpath = "//a[contains(text(),'Письмо директору')]")
    private WebElement letterToDirector;

    @FindBy(xpath = "//div[@class='footer-contact__left']//button[contains(@class, 'addMessage_btn')]")
    private WebElement addMessage;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDiscountGoods() {
        discountGoods.click();
    }

    public void clickOnTradeInGoods() {
        tradeInGoods.click();
    }

    public void clickOnLetterToDirector() {
        letterToDirector.click();
    }

    public void clickOnAddMessage() {
        addMessage.click();
    }
}
