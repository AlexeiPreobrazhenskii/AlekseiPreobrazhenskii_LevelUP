package ru.levelup.at.hw6;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestExercise2 {

    private WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void SetupProperty() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_win32/chromedriver.exe");
    }

    @BeforeMethod
    public void ThisDriver() {
        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, 30);

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void Test1() {
        driver.manage().window().maximize();
        driver.navigate().to("https://mail.ru/");
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, "Mail.ru: почта, поиск в интернете, новости, игры");
        driver.findElement(By.xpath("//input[@placeholder='Имя ящика']")).sendKeys("aleksei.petrov.900@mail.ru");
        driver.findElement(By.xpath("//button[contains(text(),'Ввести пароль')]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Пароль']")).sendKeys("EOkyOnRyr33*");
        driver.findElement(By.xpath("//button[@type='button'][contains(text(),'Войти')]")).click();
        driver.findElement(By.xpath("//div[@aria-label='aleksei.petrov.900@mail.ru']"));
        System.out.println("Имя пользователя проверено");

        WebElement CheckName = driver.findElement(By.cssSelector("div[aria-label='aleksei.petrov.900@mail.ru']"));
        assertTrue(CheckName.isDisplayed());

        System.out.println("Логин найден");

        driver.findElement((By.xpath("//span[@class='compose-button__txt']")));

        driver.findElement(By.xpath("//span[@class='compose-button__txt']")).click();

        driver.findElement(
                  By.xpath("//div[@class='container--ItIg4 size_s--2eBQT size_s--3_M-_']//input[@type='text']"))
              .sendKeys("aleksei.petrov.900@mail.ru");
        driver.findElement(By.xpath("//input[@name='Subject']")).sendKeys("ТестЗадание №2");
        driver.findElement(By.xpath("    //div[@role='textbox']")).sendKeys("ТекстПисьмаЗадание №2");
        driver.findElement(By.xpath("//span[@title='Отправить']")).click();
        System.out.println("Письмо Отправлено");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Закрыть']"))).click();
        //Закр Алерт

        //Переход в Отправленные
        driver.findElement(By.xpath("//div[@id='sideBarContent']//div[contains(text(),'Отправленные')]")).click();
        System.out.println("Нажали кнопку Входящие");

        //Проверка присутствия письма в отправленных
        WebElement CheckSafeMailInSend = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'aleksei.petrov.900@mail.ru')]")));
        Assert.assertEquals(CheckSafeMailInSend.getText(), "aleksei.petrov.900@mail.ru");
        System.out.println("Письмо в папке Отправленные");

        //Переход в папку ТЕСТ
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Тест')]"))).click();

        //        Verify, что письмо появилось в папке «Тест»

        //Проверка присутствия письма
        WebElement CheckSafeMail =
            wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[@title='Aleksei Petrov <aleksei.petrov.900@mail.ru>']")));
        Assert.assertEquals(CheckSafeMail.getText(), "Aleksei Petrov");
        CheckSafeMail.click();
        System.out.println("Открыли письмо");

        //        Verify контент, адресата и тему письма (должно совпадать с пунктом 3)

        //Проверка По адресату
        String CheckAddressInMail = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[contains(@class, 'letter-contact')]"))).getText();
        Assert.assertEquals(CheckAddressInMail, "Aleksei Petrov");
        System.out.println("Address pass");

        //Проверка По теме
        String CheckThemeInMail =
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='thread__subject']")))
                .getText();
        Assert.assertEquals(CheckThemeInMail, "ТестЗадание №2");
        System.out.println("Theme pass");

        //Проверка По тексту в Письме
        String CheckDocInMail =
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[contains(text(),'ТекстПисьмаЗадание №2')]")))
                .getText();
        Assert.assertEquals(CheckDocInMail, "ТекстПисьмаЗадание №2");
        System.out.println("Проверка письма - Успешна");

        //        Выйти из учётной записи

        //Выход. Раскрыть список где кнопка выход
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[@id='headline']//span[contains(text(), 'aleksei.petrov.900@mail.ru')]  "))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Выйти')]"))).click();
        System.out.println("Выход выполнен");
    }

    @AfterMethod
    public void ForClose() {
        driver.quit();
    }
}
