package com.qa.TechtorialCRM.pages;

import com.qa.TechtorialCRM.UTILS.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "title")
    WebElement title;

    @FindBy(xpath = "//h1[contains(text(),'Login')]")
    WebElement login;

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(tagName = "button")
    WebElement loginButton;

    public void verifyLoginPage(WebDriver driver, String emailadress) {
        Assert.assertTrue(login.isDisplayed() & login.isEnabled());
        Assert.assertEquals(driver.getTitle(), emailadress);
    }

    public void setLogin(){
        email.sendKeys(ConfigReader.readProperty("email"));
        password.sendKeys(ConfigReader.readProperty("password"));
        loginButton.click();
    }

}
