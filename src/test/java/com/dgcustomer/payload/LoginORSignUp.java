package com.dgcustomer.payload;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import com.dgcustomer.utilities.WaitUtils;

public class LoginORSignUp {

    private AppiumDriver driver;

    private By mobileNumberField = By.xpath("//android.widget.EditText");
    private By checkTC = By.xpath("//android.widget.CheckBox");
    private By loginButton = By.xpath("//android.widget.Button[@content-desc='Login / Signup']");
    private By proceedBtn = By.xpath("//android.widget.Button[@content-desc='Verify']");
    private By otp=By.xpath("//android.widget.ScrollView/android.view.View[6]");
    private By locationDeny=By.xpath("	\r\n"
    		+ "//android.widget.Button[@content-desc=\"Deny\"]");
    
    
    public LoginORSignUp(AppiumDriver driver) {
        this.driver = driver;
    }

    public void enterMobileNumber(String number) {
        WaitUtils.waitForElementVisible(driver, mobileNumberField, 15).click();
        driver.findElement(mobileNumberField).sendKeys(number);
        
    }
    public String getEnteredMobileNumber() {
        String value=driver.findElement(mobileNumberField).getText();
        return value;
    }

    public void clickLogin() {
        WaitUtils.waitForElementClickable(driver, checkTC, 10).click();
        WaitUtils.waitForElementClickable(driver, loginButton, 10).click();  
    }

    public void clickVerify() {
        WaitUtils.waitForElementClickable(driver, proceedBtn, 15).click();
    }
    public void clickLocationDeny() {
    	WaitUtils.waitForElementClickable(driver, locationDeny, 15).click();
    }

}
