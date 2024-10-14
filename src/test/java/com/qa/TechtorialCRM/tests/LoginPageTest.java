package com.qa.TechtorialCRM.tests;

import com.qa.TechtorialCRM.pages.LoginPage;
import com.qa.TechtorialCRM.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class LoginPageTest extends TestBase {
    @Test
  public void validateLoginFunctionality(){
    LoginPage loginPage=new LoginPage(driver);
    loginPage.setLogin();
    MainPage mainPage=new MainPage(driver);
    mainPage.verifyHeader(driver,"Dashboard");
      List<String>expectedModuls= Arrays.asList("Proposals","Estimates","Invoices","Payments","Credit Notes","Items");
    mainPage.verifyModules(driver,6,expectedModuls);
    }
}
