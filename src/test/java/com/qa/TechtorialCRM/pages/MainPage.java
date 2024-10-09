package com.qa.TechtorialCRM.pages;

import com.qa.TechtorialCRM.UTILS.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainPage {
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    WebElement header;

    public void verifyHeader(WebDriver driver,String expectedHeader){
        Assert.assertEquals(BrowserUtils.getText(header),expectedHeader);
    }

}
