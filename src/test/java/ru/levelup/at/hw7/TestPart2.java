package ru.levelup.at.hw7;

import org.testng.annotations.Test;

public class TestPart2 extends BaseSeleniumPageObjectTest {

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
        indexPage.enterEnterTextBodyInNewMail(textbody); //До данног омомента ничего не меняется

        indexPage.methodSendNewEmail();  //Вместо сейв, будет отправить себе
        indexPage.methodClosePopupWindow();
        indexPage.methodGoToSentEmail(); //Переход в папку отправленные
        //Асе рт что письмо в отправленных
        indexPage.methodClickToTEST_DIR(); //Переход в папку ТЕСТ
        //Проверка наличия письма в папке ТЕСТ
        //Проверка письма по адресу
        //Проверка письма по теме
        //Проверка письма по боди тексту

        indexPage.methodExitFromAccountStep1(); //Выход, жмем и раскрываем меню
        indexPage.methodExitFromAccountStep2(); //Жмем выйти




    }
}
