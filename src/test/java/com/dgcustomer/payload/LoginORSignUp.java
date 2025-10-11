package com.dgcustomer.payload;

import io.appium.java_client.AppiumDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginORSignUp {
    private AppiumDriver driver;

    private By mobileNumberField = By.xpath("//android.widget.EditText");
    private By checkTC = By.xpath("//android.widget.CheckBox");
    private By loginButton = By.xpath("//android.widget.Button[@content-desc='Login / Signup']");
    private By proceedBtn= By.xpath("//android.widget.Button[@content-desc=\"Proceed\"]");

    //private By fullName=By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText[1]");

    
 
    public LoginORSignUp(AppiumDriver driver) {
        this.driver = driver;
    }

    public void enterMobileNumber(String number) {
    	driver.findElement(mobileNumberField).click();
        driver.findElement(mobileNumberField).sendKeys(number);
    }

    public void clickLogin() throws Exception {
    	driver.findElement(checkTC).click();
        driver.findElement(loginButton).click();
        Thread.sleep(4000);
        
        driver.findElement(proceedBtn).click();
       
        
    }
    





    


    
}
