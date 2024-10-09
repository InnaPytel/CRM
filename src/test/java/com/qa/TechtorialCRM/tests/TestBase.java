package com.qa.TechtorialCRM.tests;

import com.qa.TechtorialCRM.UTILS.BrowserUtils;
import com.qa.TechtorialCRM.UTILS.ConfigReader;
import com.qa.TechtorialCRM.UTILS.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("qa_url"));
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        if(iTestResult.isSuccess()){
            BrowserUtils.getScreenShot(driver,"TechtorialCRM");
        }

        //driver.quit();
    }
}

