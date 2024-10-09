package com.qa.TechtorialCRM.tests;

import com.qa.TechtorialCRM.pages.LoginPage;
import com.qa.TechtorialCRM.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTest extends TestBase {
    @Test
  public void validateLoginFunctionality(){
    LoginPage loginPage=new LoginPage(driver);
    loginPage.setLogin();
    MainPage mainPage=new MainPage(driver);
    mainPage.verifyHeader(driver,"Dashboard");
    }

}
