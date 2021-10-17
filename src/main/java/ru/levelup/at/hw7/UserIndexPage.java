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


    @FindBy(xpath = "div[aria-label='aleksei.petrov.900@mail.ru']")
    private WebElement getUserAccountName;
    public String assertUserAccountName(){    //Не понятно как делать в тест НГ
        return wait.until(visibilityOf(getUserAccountName)).getText() ;
    }
    @FindBy(xpath ="//span[@class='compose-button__txt']" )
    private WebElement MadeNewMail;
    @FindBy(xpath ="//div[@class='container--ItIg4 size_s--2eBQT size_s--3_M-_']//input[@type='text']" )
    private WebElement EnterAddressInNewMail;
    @FindBy(xpath ="//input[@name='Subject']" )
    private WebElement EnterThemeInNewMail;
    @FindBy(xpath ="//div[@role='textbox']" )
    private WebElement EnterTextBodyInNewMail;
    @FindBy(xpath ="//span[@title='Сохранить']" )
    private WebElement ClickSaveNewEmail;
    @FindBy(css ="[title='Закрыть']" )
    private WebElement ClickCloseSaveNewEmail;
    @FindBy(xpath ="//div[contains(text(),'Черновики')]" )
    private WebElement EnterToSaveMail;
    @FindBy(xpath ="//*[@title='aleksei.petrov.900@mail.ru']" ) //Не понятно как делать в тест НГ
    private WebElement AssertAndClickOnFindSaveEmail;
    @FindBy(xpath ="//div[@class='compose-app__footer']//span[@title='Отправить']" )
    private WebElement SendNewEmailFromSave;
    @FindBy(xpath ="//span[@title='Закрыть']" )
    private WebElement ClosePopupWindow;

    @FindBy(xpath ="//span[@class='octopus__title']" )
    private WebElement AssertSaveMailWillEmpty;

    @FindBy(xpath ="//div[@id='sideBarContent']//div[contains(text(),'Отправленные')]" )
    private WebElement GoToSentEmail;

    @FindBy(xpath ="//div[@id='headline']//span[contains(text(), 'aleksei.petrov.900@mail.ru')]  " )
    private WebElement ExitFromAccountStep1;

    @FindBy(xpath ="//div[contains(text(), 'Выйти')]" )
    private WebElement ExitFromAccountStep2;

    // Часть 1 закончилась, начинается часть 2 то, чего не хватило в 1й части

    @FindBy(xpath ="//span[@title='Отправить']" )
    private WebElement SendNewEmail;

    @FindBy(xpath ="//div[contains(text(),'Тест')]" )
    private WebElement ClickToTEST_DIR;

    // Добавлено для части 3

    @FindBy(xpath ="//div[contains(text(),'Входящие')]" )
    private WebElement ClickToEnter_DIR;

    @FindBy(xpath ="//div[contains(text(),'Письма себе')]" )
    private WebElement EnterMailForSelf;

    @FindBy(xpath ="//span[@title='Aleksei Petrov <aleksei.petrov.900@mail.ru>']" )
    private WebElement OpenMailForSelf;

    @FindBy(xpath ="//*[@title='Удалить']" )
    private WebElement DeleteMail;

    @FindBy(xpath ="//a[@href='/trash/']" )
    private WebElement ClickToDelete_DIR;

    @FindBy(xpath ="//*[@title='Aleksei Petrov <aleksei.petrov.900@mail.ru>']" )
    private WebElement CheckMailInDelete_DIR;






    //************Методы //Методы //Методы //Методы //Методы //Методы//Методы//Методы****************************
    public void sendKeysToNameInputField(final String name) {
        wait.until(visibilityOf(enterLoginName)).sendKeys(name);
    }

    public void sendKeysToPasswordInputField(final String password) {
        wait.until(visibilityOf(enterPassword)).sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(elementToBeClickable(clickButtonLogin)).click();
    }

    public void clickEnterButtonAfterPassword() {
        wait.until(elementToBeClickable(clickEnterButton)).click();
    }

    public void clickMadeNewMail() {
        wait.until(elementToBeClickable(MadeNewMail)).click();
    }

    //Ввод адреса, темы и тела письма
    public void enterEnterAddressInNewMail(final String address) {
        wait.until(elementToBeClickable(EnterAddressInNewMail)).sendKeys(address);
    }
    public void enterEnterThemeInNewMail(final String theme) {
        wait.until(elementToBeClickable(EnterThemeInNewMail)).sendKeys(theme);
    }
    public void enterEnterTextBodyInNewMail(final String textbody) {
        wait.until(elementToBeClickable(EnterTextBodyInNewMail)).sendKeys(textbody);
    }

    public void methodClickSaveNewEmail() {
        wait.until(elementToBeClickable(ClickSaveNewEmail)).click();
    }

    public void methodClickCloseSaveNewEmail() {
        wait.until(elementToBeClickable(ClickCloseSaveNewEmail)).click();
    }

    public void methodEnterToSaveMail() {
        wait.until(elementToBeClickable(EnterToSaveMail)).click();
    }

    public void methodAssertAndClickOnFindSaveEmail() {
        wait.until(elementToBeClickable(AssertAndClickOnFindSaveEmail)).click();
    }

    public void methodSendNewEmailFromSave() {
        wait.until(elementToBeClickable(SendNewEmailFromSave)).click();
    }

    public void methodClosePopupWindow() {
        wait.until(elementToBeClickable(ClosePopupWindow)).click();
    }

    public void methodGoToSentEmail() {
        wait.until(elementToBeClickable(GoToSentEmail)).click();
    }
    public void methodExitFromAccountStep1() {
        wait.until(elementToBeClickable(ExitFromAccountStep1)).click();
    }

    public void methodExitFromAccountStep2() {
        wait.until(elementToBeClickable(ExitFromAccountStep2)).click();
    }

    //Начало 2й  части
    public void methodSendNewEmail() {
        wait.until(elementToBeClickable(SendNewEmail)).click();
    }

    public void methodClickToTEST_DIR() {
        wait.until(elementToBeClickable(ClickToTEST_DIR)).click();
    }
    public void methodClickToEnter_DIR() {
        wait.until(elementToBeClickable(ClickToEnter_DIR)).click();
    }

    public void methodEnterMailForSelf() {
        wait.until(elementToBeClickable(EnterMailForSelf)).click();
    }
    public void methodOpenMailForSelf() {
        wait.until(elementToBeClickable(OpenMailForSelf)).click();
    }

    public void methodDeleteMail() {
        wait.until(elementToBeClickable(DeleteMail)).click();
    }
    public void methodClickToDelete_DIR() {
        wait.until(elementToBeClickable(ClickToDelete_DIR)).click();
    }
    public void methodCheckMailInDelete_DIR() {
        wait.until(elementToBeClickable(CheckMailInDelete_DIR)).click();
    }

}
