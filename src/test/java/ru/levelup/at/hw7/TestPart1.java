package ru.levelup.at.hw7;


import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class TestPart1 extends BaseSeleniumPageObjectTest {

    @Test
    public void registerUserTest() {
        String username = "aleksei.petrov.900@mail.ru";
        String password = "EOkyOnRyr33*";
        String address = "aleksei.petrov.900@mail.ru";
        String theme = "Задание №1";
        String textbody = "ТекстПисьма";


        UserIndexPage indexPage = new UserIndexPage(driver);
        driver.manage().window().maximize();

        indexPage.open();
        indexPage.sendKeysToNameInputField(username);
        indexPage.clickLoginButton();
        indexPage.sendKeysToPasswordInputField(password);
        indexPage.clickEnterButtonAfterPassword();
        //assert equals(indexPage.assertUserAccountName());
        indexPage.clickMadeNewMail();
        indexPage.enterEnterAddressInNewMail(address);
        indexPage.enterEnterThemeInNewMail(theme);
        indexPage.enterEnterTextBodyInNewMail(textbody);
        indexPage.methodClickSaveNewEmail();
        indexPage.methodClickCloseSaveNewEmail();
        indexPage.methodEnterToSaveMail();
        indexPage.methodAssertAndClickOnFindSaveEmail();
        indexPage.methodSendNewEmailFromSave();
        indexPage.methodClosePopupWindow();

        indexPage.methodEnterToSaveMail(); //Возвращаемся в черновик

        indexPage.methodGoToSentEmail(); //Переход в папку отправленные
        indexPage.methodExitFromAccountStep1(); //Выход, жмем и раскрываем меню
        indexPage.methodExitFromAccountStep2(); //Жмем выйти




    }
}
