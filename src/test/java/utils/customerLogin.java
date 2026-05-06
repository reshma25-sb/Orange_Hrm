package utils;

import org.openqa.selenium.WebDriver;

import pageObject.loginPage;

public class customerLogin {

    public static void doLogin(WebDriver driver, String user, String pass) {
        loginPage loginPage = new loginPage(driver);
        loginPage.loginUser();
    }
}