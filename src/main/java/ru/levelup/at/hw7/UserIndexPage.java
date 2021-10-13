package ru.levelup.at.hw7;

import static org.openqa.selenium.support.ui.ExpectedConditions.*; // Стало короче, но он исчез из кода

import java.beans.Visibility;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Внутри данного класса, описываем все элементы на странице в которой мы Логинемся
public class UserIndexPage {

    private static final String URL = "https://mail.ru/";
    private WebDriver driver; //2. Объявление поля для конструктора, которое является Вебдрайвером
    private WebDriverWait wait; //3. Объявление поля для конструктора, и Для ожиданий
    private WebElement enterButton;  // 1.

    //4. Конструктор класса, в который передаем экземпляр нашего драйвера.
    //   - Что бы задать явные ожидания на уровне страницы, т.к. в тесте их уже нет
    //   - Что бы проинициализировать PageFactory
    public UserIndexPage(WebDriver driver) {
        this.driver = driver; // Передаем экземпляр драйвера
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this); //Даст нам поиск селекторов через @FindBy
    }

    public void open() {
        driver.navigate().to(URL);
    }

//    public void enterLogin(){
//        driver.findElement(By.xpath("//input[@placeholder='Имя ящика']")).sendKeys();
//    }

    public void clickEnterButton() {
        wait.until(elementToBeClickable(enterButton)).click();
    }


    @FindBy(xpath = "//input[@placeholder='Имя ящика']")
    private WebElement enterLoginName;

    @FindBy(xpath = "//input[@placeholder='Пароль']")
    private WebElement enterPassword;


    @FindBy(xpath = "//button[contains(text(),'Ввести пароль')]")
    private WebElement clickButtonLogin;


    @FindBy(xpath = "//button[@type='button'][contains(text(),'Войти')]")
    private WebElement clickEnterButton;




    //Методы
    public void sendKeysToNameInputField(final String name){
        wait.until(visibilityOf(enterLoginName)).sendKeys(name);
    }

    public void sendKeysToPasswordInputField(final String password){
        wait.until(visibilityOf(enterPassword)).sendKeys(password);
    }

    public void clickLoginButton(){
        wait.until(elementToBeClickable(clickButtonLogin)).click();

    }

    public void clickEnterButtonAfterPassword(){
        wait.until(elementToBeClickable(clickEnterButton)).click();

    }







}
