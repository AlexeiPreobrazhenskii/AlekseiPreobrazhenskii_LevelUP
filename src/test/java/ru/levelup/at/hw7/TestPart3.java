package ru.levelup.at.hw7;

import org.testng.annotations.Test;

public class TestPart3 extends BaseSeleniumPageObjectTest {

    @Test
    public void registerUserTest() {
        String username = "aleksei.petrov.900@mail.ru";
        String password = "EOkyOnRyr33*";
        String address = "aleksei.petrov.900@mail.ru";
        String theme = "Задание №3";
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
        indexPage.methodClickToEnter_DIR(); //Переход в папку входящие
        indexPage.methodEnterMailForSelf(); //Переход в подпапку себе
        //Асе рт что письмо в отправленных
        //Проверка письма по адресу
        //Проверка письма по теме
        //Проверка письма по боди тексту
        indexPage.methodOpenMailForSelf();
        indexPage.methodDeleteMail();
        indexPage.methodClickToDelete_DIR();
        indexPage.methodCheckMailInDelete_DIR();
        //Проверка письма в папке удаленные
        indexPage.methodExitFromAccountStep1(); //Выход, жмем и раскрываем меню
        indexPage.methodExitFromAccountStep2(); //Жмем выйти




    }
}
