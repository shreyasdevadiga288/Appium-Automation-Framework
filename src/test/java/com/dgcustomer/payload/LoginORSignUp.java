package com.dgcustomer.payload;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import com.dgcustomer.utilities.WaitUtils;

public class LoginORSignUp {

    private AppiumDriver driver;

    private By mobileNumberField = By.xpath("//android.widget.EditText");
    private By checkTC = By.xpath("//android.widget.CheckBox");
    private By loginButton = By.xpath("//android.widget.Button[@content-desc='Login / Signup']");
    private By proceedBtn = By.xpath("//android.widget.Button[@content-desc='Proceed']");

    public LoginORSignUp(AppiumDriver driver) {
        this.driver = driver;
    }

    public void enterMobileNumber(String number) {
        WaitUtils.waitForElementVisible(driver, mobileNumberField, 15).click();
        driver.findElement(mobileNumberField).sendKeys(number);
    }

    public void clickLogin() {
        WaitUtils.waitForElementClickable(driver, checkTC, 10).click();
        WaitUtils.waitForElementClickable(driver, loginButton, 10).click();        
        WaitUtils.waitForElementClickable(driver, proceedBtn, 15).click();
    }
}
