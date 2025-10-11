package com.dgcustomer.payload;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateProfile {
	
	private AppiumDriver driver;
	
    private By fullName=By.xpath("(//android.widget.EditText)[1]");
    private By email=By.xpath("(//android.widget.EditText)[2]");
    private By gender=By.xpath("//android.view.View[@content-desc=\"Select Gender\"]");
    private By male=By.xpath("//android.view.View[@content-desc=\"Male\"]");	
    private By dob=By.xpath("//android.view.View[@content-desc=\"Select Date of Birth\"]");
    private By dobSave=By.xpath("//android.widget.Button[@content-desc=\"Save\"]");
    private By saveDetails=By.xpath("//android.widget.Button[@content-desc=\"Save\"]");
    
    public CreateProfile(AppiumDriver driver) {
        this.driver = driver;
    }
       
    public void setFullName() {
    	driver.findElement(fullName).click();
	   	driver.findElement(fullName).sendKeys("Amoeba");
    }
    public void setEmail() {
	   	driver.findElement(email).click();
	   	driver.findElement(email).sendKeys("amoeba@yahoo.com");
	   	driver.navigate().back();
    }
    public void setGender() {
	   	driver.findElement(gender).click();
	   	driver.findElement(male).click(); 
    }
    public void setDob() {
	   	driver.findElement(dob).click(); 
	   	driver.findElement(dobSave).click();
    }
    public void saveDetails() {	
	   	driver.findElement(saveDetails).click();
   }


}
