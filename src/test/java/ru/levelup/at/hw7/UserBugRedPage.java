package ru.levelup.at.hw7;

import org.testng.annotations.Test;

public class UserBugRedPage extends BaseSeleniumPageObjectTest{

    @Test
    public void registerUserTest(){
        String username = "aleksei.petrov.900@mail.ru";
        String password = "EOkyOnRyr33*";
        UserIndexPage indexPage = new UserIndexPage(driver);

        indexPage.open();
        indexPage.sendKeysToNameInputField(username);
        indexPage.clickLoginButton();
        indexPage.sendKeysToPasswordInputField(password);
        indexPage.clickEnterButtonAfterPassword();






    }



}
