package ru.levelup.at.hw7;

//Здесь находятся Before & After

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class BaseSeleniumPageObjectTest {

    protected WebDriver driver;
    public static WebDriver driverStatic;

    @BeforeSuite
    public void SetupProperty() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_win32/chromedriver.exe");
    }

    @BeforeMethod
    public void ThisDriver() {
        driver = new ChromeDriver();
        //wait = new WebDriverWait(driver, 30);  Теперь Wait в PO_Class
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void ForClose() {
        driver.quit();
    }
}





