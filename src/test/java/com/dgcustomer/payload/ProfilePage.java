package com.dgcustomer.payload;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class ProfilePage {
	private AppiumDriver driver;
	private By settingsOpt=By.xpath("	\r\n"
			+ "//android.view.View[@content-desc=\"Settings\"]");	
	
	public ProfilePage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void clickSettings() {
		driver.findElement(settingsOpt).click();
	}
}
