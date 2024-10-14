package com.qa.TechtorialCRM.pages;

import com.qa.TechtorialCRM.UTILS.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPage {
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    WebElement header;
    @FindBy(xpath = "//span[contains(text(),'Sales')]")
    WebElement SalesModule;
@FindBy(xpath = "//li[@class='menu-item-sales active']//a//span[@class=\"sub-menu-text\"]")
    List<WebElement> modules;

    public void verifyHeader(WebDriver driver,String expectedHeader){
        Assert.assertEquals(BrowserUtils.getText(header),expectedHeader);
    }
    public void verifyModules(WebDriver driver,int numberOfColumns, List<String> expectedResults){
        SalesModule.click();
        Assert.assertEquals(modules.size(),numberOfColumns);
        for (int i=0;i<modules.size()-1;i++){
            Assert.assertEquals(BrowserUtils.getText(modules.get(i)),expectedResults.get(i));
        }
    }

}
