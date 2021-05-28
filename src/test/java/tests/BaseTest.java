package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.SendMessagePage;
import pages.TradeInPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private static final String AVIC_URL = "https://avic.ua/";

    private WebDriver driver;

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SendMessagePage getSendMessagePage() {
        return new SendMessagePage(getDriver());
    }

    public TradeInPage getTradeInPage() {
        return new TradeInPage(getDriver());
    }
}
